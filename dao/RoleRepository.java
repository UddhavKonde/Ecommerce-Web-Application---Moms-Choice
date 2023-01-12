package com.ECommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ECommerce.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
