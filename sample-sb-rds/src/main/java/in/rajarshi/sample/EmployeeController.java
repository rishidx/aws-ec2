package in.rajarshi.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<EmployeeModel> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
