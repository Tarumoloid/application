package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="staff")
public class Staff {

    @Id
    @Column(name = "id")
    private String id;
	   
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name="name")
	  private String name;
	 
	  @Column(name="age")
	  private int age;

}
