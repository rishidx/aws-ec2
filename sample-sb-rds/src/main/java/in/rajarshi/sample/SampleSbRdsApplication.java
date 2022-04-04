package in.rajarshi.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSbRdsApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleSbRdsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		employeeRepository.save(new EmployeeModel(123L, "Emp1", "base1", "12345"));
		employeeRepository.save(new EmployeeModel(223L, "Emp2", "base1", "12346"));
		employeeRepository.save(new EmployeeModel(323L, "Emp3", "base2", "12347"));
		employeeRepository.save(new EmployeeModel(423L, "Emp4", "base2", "12348"));
		employeeRepository.save(new EmployeeModel(523L, "Emp5", "base3", "12349"));
		employeeRepository.save(new EmployeeModel(623L, "Emp6", "base4", "12355"));
		
		employeeRepository.flush();
	}

}
