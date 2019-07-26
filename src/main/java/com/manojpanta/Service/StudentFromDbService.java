package com.manojpanta.Service;

import com.manojpanta.Dao.StudentFromDbDao;
import com.manojpanta.Entity.StudentFromDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentFromDbService {
    @Autowired
    private StudentFromDbDao studentFromDbDao;

    public Collection<StudentFromDb> index() {
        return studentFromDbDao.findAll();
    }
}
