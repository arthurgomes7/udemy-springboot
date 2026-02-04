package com.javaudemy.springboot.repository;

import com.javaudemy.springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> { // Product -> entidade / Long - tipo do ID

}