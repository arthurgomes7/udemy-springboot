package com.javaudemy.springboot.repository;

import com.javaudemy.springboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { // OrderItem -> entidade / Long - tipo do ID

}
