
package com.dhanubuilding.bankingBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.dhanubuilding")
@EnableJpaRepositories(basePackages = "com.dhanubuilding.Repository")
@EntityScan(basePackages = "com.dhanubuilding.Entity")
public class BankingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingBackendApplication.class, args);
	}
}
