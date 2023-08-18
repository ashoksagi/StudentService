package com.student.register;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
@EntityScan("my.student.register")  
public class Student {
//
	
	
//	int id -- auto gen PK
//	String busmodel
//	int capacity
//	int UserId --- User table key 
//  String startingPoint
//	String endPoint
//  int reviewRating
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int rollnum;
	String collageName;
	String StudentName; 
	String startingPoint;
	String endPoint;
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	

}
	