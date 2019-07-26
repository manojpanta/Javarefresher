package com.manojpanta.Dao;


import com.manojpanta.Entity.StudentFromDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentFromDbDao extends JpaRepository<StudentFromDb, Long> {
}
