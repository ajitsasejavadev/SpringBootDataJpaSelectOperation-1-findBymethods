package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	List<Product> findByProdCodeOrProdCostLessThan(String string, double d);

	List<Product> findByProdCostOrderByProdCodeDesc(double d);

	List<Product> findByProdIdOrProdCodeIsNotNullOrProdCostLessThanOrderByProdCodeDesc(Integer prodId, Double prodCost);


	

}
