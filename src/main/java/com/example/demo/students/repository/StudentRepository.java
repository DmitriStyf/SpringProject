package com.example.demo.students.repository;

import com.example.demo.students.Students;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository <Students, Long> {

    List<Students> findAllByFirstN(String firstN);

    List<Students> findAllByAge(Integer age);

    List<Students> findAllByDepartment(Integer department);
}