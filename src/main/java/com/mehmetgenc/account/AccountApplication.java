package com.mehmetgenc.account;

import com.mehmetgenc.account.model.Customer;
import com.mehmetgenc.account.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Clock;
import java.util.HashSet;

@SpringBootApplication
public class AccountApplication  implements CommandLineRunner {

	private final CustomerRepository customerRepository;

	public AccountApplication(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Override
	public void run(String... args)  throws Exception{
		Customer customer = customerRepository.save(new Customer("", "Mehmet", "Genc", new HashSet<>()));
		Customer customer2 = customerRepository.save(new Customer("", "Meh", "Genc", new HashSet<>()));
		System.out.println(customer);
	}

	@Bean
	public Clock clock() {
		return Clock.systemUTC();
	}

}
