package in.rajarshi.sample;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeModel implements Serializable {

	@Id
	private Long employeeID;
	
	private String empNme;
	
	private String empBaseBranch;
	
	private String empContactNo;

	public Long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmpNme() {
		return empNme;
	}

	public void setEmpNme(String empNme) {
		this.empNme = empNme;
	}

	public String getEmpBaseBranch() {
		return empBaseBranch;
	}

	public void setEmpBaseBranch(String empBaseBranch) {
		this.empBaseBranch = empBaseBranch;
	}

	public String getEmpContactNo() {
		return empContactNo;
	}

	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeModel [employeeID=").append(employeeID).append(", empNme=").append(empNme)
				.append(", empBaseBranch=").append(empBaseBranch).append(", empContactNo=").append(empContactNo)
				.append("]");
		return builder.toString();
	}

	public EmployeeModel(Long employeeID, String empNme, String empBaseBranch, String empContactNo) {
		super();
		this.employeeID = employeeID;
		this.empNme = empNme;
		this.empBaseBranch = empBaseBranch;
		this.empContactNo = empContactNo;
	}

	public EmployeeModel() {
		super();
	}
	
	
}
