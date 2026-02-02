package com.javaudemy.springboot.repository;

import com.javaudemy.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { // user -> entidade / Long - tipo do ID

}
