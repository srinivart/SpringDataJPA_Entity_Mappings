package com.srinivart;

import com.srinivart.entity.Customer;
import com.srinivart.entity.Item;
import com.srinivart.repository.CustomerRepository;
import com.srinivart.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}


	@Autowired
    private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public void run(String... args){

		Customer customer = new Customer("srini");
		Item item1 = new Item("mobile");
		Item item2 = new Item("macbook");

		customer.getItems().add(item1);
		customer.getItems().add(item2);

		customerRepository.save(customer);


	}

}
