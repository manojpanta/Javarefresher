package com.manojpanta.Controller;

import com.manojpanta.Entity.Student;
import com.manojpanta.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)

    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentByid(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteStudentById(@PathVariable("id") int id ) {
        studentService.removeStudentById(id);
        return "this resource has been deleted.";
    }
}
