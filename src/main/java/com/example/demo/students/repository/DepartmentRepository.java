package com.example.demo.students.repository;

import com.example.demo.students.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository <Department, Long> {

    List<Department> findAllByDepartment (String department);
    Department findIdBySpeciality (String speciality);

}
