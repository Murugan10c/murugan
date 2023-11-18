package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@RestController
public class Studentcontroller {
	@Autowired
	StudentService service;
	
	
	/*@PostMapping("/savestudent")
	public  Student saveStudentDetails(@RequestBody Student st)
	{
	
			return  repo1.save(st);
		
	}*/
	@GetMapping("/getbyname/{name}")
	public List<Student> getByname(@PathVariable String name){
		return service.getByName(name);
		
	}
	@GetMapping("/getbypercentage/{percentage}")
	public List<Student> getBypercentage(@PathVariable int percentage){
		return service.getBypercentage(percentage);
		
	}
	@PutMapping("/updatethepercentage/{percentage}/{name}")
	public String  updatethePercentage(@PathVariable int percentage,@PathVariable String name){
		return service.updatethepercentage(percentage,name);
	}
	@GetMapping("/test")
	public String getParamRequest(@RequestParam int id,@RequestParam String name)
	{
		return "your id is"+id+"your name is"+name;
	}
}
