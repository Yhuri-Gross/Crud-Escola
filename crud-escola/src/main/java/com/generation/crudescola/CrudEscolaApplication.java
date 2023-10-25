package com.generation.crudescola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages ="com/generation/crudescola/model" )
@SpringBootApplication
public class CrudEscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudEscolaApplication.class, args);
	}

}
