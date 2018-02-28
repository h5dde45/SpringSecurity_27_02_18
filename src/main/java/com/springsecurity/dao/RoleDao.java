package com.springsecurity.dao;

import com.springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Long>{

}
