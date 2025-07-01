package com.example.AWS_Deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDeployApplication {
	Person p;

	public static void main(String[] args) {
		SpringApplication.run(AwsDeployApplication.class, args);
	
	}
	public AwsDeployApplication() {
		p = new Person();
		p.setName("Mithun R");
	}
	
	@GetMapping("/")
	public String Health() {
		return "Hello " + p.getName() ;

	}
}
