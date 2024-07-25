package edu.training.osttra.second_version;

import edu.training.osttra.second_version.repository.TablesRepository;
import edu.training.osttra.second_version.service.ResourceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondVersionApplication {



	public static void main(String[] args) {

		SpringApplication.run(SecondVersionApplication.class, args);
	}

}
