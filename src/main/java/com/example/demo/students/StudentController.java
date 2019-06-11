package com.example.demo.students;


import com.example.demo.configuration.UserRoles;
import com.example.demo.configuration.repository.UserRoleRepository;
import com.example.demo.students.repository.DepartmentRepository;
import com.example.demo.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    UserRoleRepository userRoleRepository;

    @RequestMapping(method = RequestMethod.GET, path = "userroles")
    public Iterable<UserRoles> getAllUserRoles (){
        return userRoleRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.POST, path = "department/new")
    public void addDepartment (@RequestBody Department department) {
        departmentRepository.save(department);
    }

    @RequestMapping(method = RequestMethod.GET, path = "student/spec")
    public Iterable<Students> getStudentBySpec (@RequestParam("speciality") String speciality ){
        Department department = departmentRepository.findIdBySpeciality(speciality);
        return studentRepository.findAllByDepartment(department.getId());
    }


    @RequestMapping(method = RequestMethod.GET, path = "students/all")
    public Iterable<Students> getAll() {
        return studentRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "students/name")
    public Iterable<Students> getByName(@RequestParam("name") String name) {
        return studentRepository.findAllByFirstN(name);
    }

    @RequestMapping(method = RequestMethod.GET, path = "students/dep")
    public Iterable<Students> getByDep(@RequestParam("department") Integer name) {
        return studentRepository.findAllByDepartment(name);
    }

    @RequestMapping(method = RequestMethod.POST, path = "students/new")
    public void addStudent(@RequestBody Students student) {
        studentRepository.save(student);
    }

    @RequestMapping(method = RequestMethod.GET, path = "students/age")
    public Iterable<Students> getByAge(@RequestParam("age") Integer age) {
        return studentRepository.findAllByAge(age);
    }

}


