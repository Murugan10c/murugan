package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student , Long>{
List<Student> findByname(String name);
List<Student> findBypercentage(int p);
@Modifying
@Transactional
@Query(value="update student1 set percentage=?1 where name=?2",nativeQuery=true)
public int updatethepercentage(int percentage,String name);
}
