package com.teju.DemohibernateMappingExample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	
	@Id
	private int rollnum;
	private String name;
	private int marks;
	
	//@OneToOne   //for one to one relationship
	//private Laptop laptop;
	
	
	//@OneToMany  //for one to many relationship
	//private List<Laptop> laptop=new ArrayList<Laptop> ();
	
	
	@OneToMany(mappedBy="student")
	private List<Laptop> laptop=new ArrayList<Laptop> ();
	
	
	
	//@ManyToMany(mappedBy="student")
	//private List<Laptop> laptop=new ArrayList<Laptop> ();
	
	
	/*public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/
	
	
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
