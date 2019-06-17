package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("---Sample----All rows selected by findAll---");
		
		repo.findByProdCodeOrProdCostLessThan("D",8.8)
		.forEach(System.out::println);;
	
		repo.findByProdCostOrderByProdCodeDesc(2.2)
		.forEach(System.out::println);
		
		System.out.println("**************************************************************");
		List<Product> p=repo.findByProdIdOrProdCodeIsNotNullOrProdCostLessThanOrderByProdCodeDesc(5,5.5);
//		for(Product prod:p) {
//			System.out.println(prod);
//		}
		p.forEach(System.out::println);
	}

}
