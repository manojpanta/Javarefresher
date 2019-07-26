package com.manojpanta.Controller;

import com.manojpanta.Entity.StudentFromDb;
import com.manojpanta.Service.StudentFromDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class StudentFromDbController {
    @Autowired
    private StudentFromDbService studentFromDbService;
    @RequestMapping("/students")
    public Collection<StudentFromDb> index() {
        return studentFromDbService.index();
    }

    @RequestMapping("/students/{id}")
    public Object getStudentById(@PathVariable("id") Long id) {
        return studentFromDbService.show(id);
    }
}
