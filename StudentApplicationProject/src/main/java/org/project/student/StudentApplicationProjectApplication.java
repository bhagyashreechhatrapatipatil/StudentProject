package org.project.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplicationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplicationProjectApplication.class, args);
		System.out.println("started spring application");
	}

}
