package com.skill.me.graphql_in_practice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skill.me.graphql_in_practice.domains.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
