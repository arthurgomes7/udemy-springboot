package com.javaudemy.springboot.repository;

import com.javaudemy.springboot.entities.Category;
import com.javaudemy.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> { // user -> entidade / Long - tipo do ID

}