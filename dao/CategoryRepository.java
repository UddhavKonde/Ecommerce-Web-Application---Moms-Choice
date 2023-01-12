package com.ECommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ECommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
