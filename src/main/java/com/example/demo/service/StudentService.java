package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository repo;
	public List<Student> getByName(String name){
		return repo.findByname(name);
	}
	public List<Student> getBypercentage(int percentage){
		return repo.findBypercentage(percentage);
	}
	public String updatethepercentage(int percentage, String name) {
		String res=null;
		int i=repo.updatethepercentage(percentage,name);
		if(i==1) {
			res="successfully updated";
		}
		else {
			res="not updated";
		}
		return res;
	}

}
