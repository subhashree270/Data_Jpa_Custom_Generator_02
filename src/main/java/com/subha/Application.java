package com.subha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.subha.entity.Item;
import com.subha.repo.ItemRepo;

@SpringBootApplication
public class Application  implements CommandLineRunner{
	
	@Autowired
	private ItemRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		Item i=new Item();
		i.setName("WashingMachine");
		i.setQuantity(2);
		repo.save(i);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
