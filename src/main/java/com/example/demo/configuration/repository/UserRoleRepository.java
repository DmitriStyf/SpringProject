package com.example.demo.configuration.repository;

import com.example.demo.configuration.UserRoles;
import com.example.demo.students.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRoleRepository extends CrudRepository <UserRoles, Long> {

    UserRoles findByName (String name);
}
