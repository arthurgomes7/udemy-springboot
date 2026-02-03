package com.javaudemy.springboot.repository;

import com.javaudemy.springboot.entities.Order;
import com.javaudemy.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> { // order -> entidade / Long - tipo do ID

}
