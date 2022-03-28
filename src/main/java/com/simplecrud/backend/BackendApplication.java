package com.simplecrud.backend;

// import com.simplecrud.backend.model.Employee;
// import com.simplecrud.backend.repository.EmployeeRepository;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	// @Autowired
	// private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		// Employee employee = new Employee();

		// employee.setFirstName("David");
		// employee.setLastName("Geraldo");
		// employee.setEmail("davidgrldo123@gmail.com");

		// employeeRepository.save(employee);


		// Employee employee1 = new Employee();

		// employee1.setFirstName("John");
		// employee1.setLastName("Doe");
		// employee1.setEmail("johndoe@gmail.com");

		// employeeRepository.save(employee1);
	}

}
