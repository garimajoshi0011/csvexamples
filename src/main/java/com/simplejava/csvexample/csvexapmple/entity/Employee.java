package com.simplejava.csvexample.csvexapmple.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "employee", catalog = "javatechie")
@NoArgsConstructor
@AllArgsConstructor
public class Employee{
	

	@Id
	@GeneratedValue
	public Integer id;

	public String firstName;
	public String lastName;
	public String email;
	public String department;

}
