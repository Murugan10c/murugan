package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Student1")

public class Student {
@Id
@SequenceGenerator(name="Student1_Sequence",sequenceName="Student1_Sequence",allocationSize=1)
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Student1_Sequence")
Long id;
String name;
String clg;
int percentage;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getClg() {
	return clg;
}

public void setClg(String clg) {
	this.clg = clg;
}

public int getPercentage() {
	return percentage;
}

public void setPercentage(int percentage) {
	this.percentage = percentage;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
