package com.example.examen.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "clients")
public class Client {


	@Id
	@Field("id")
	@JsonIgnore
	private int id;
	private String nameUser;
	private String password;
	private String name;
	private String lastname;
	private String email;
	private Integer age;
	private double height;
	private double bodyWeight;
	private double IMC;
	private double GEB;
	private double ETA;
	private Date date_creation;
	private Date date_Update;

	public Client() {

	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBodyWeight() {
		return bodyWeight;
	}

	public void setBodyWeight(double bodyWeight) {
		this.bodyWeight = bodyWeight;
	}

	public double getIMC() {
		return IMC;
	}

	public void setIMC(double iMC) {
		IMC = iMC;
	}

	public double getGEB() {
		return GEB;
	}

	public void setGEB(double gEB) {
		GEB = gEB;
	}

	public double getETA() {
		return ETA;
	}

	public void setETA(double eTA) {
		ETA = eTA;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public Date getDate_Update() {
		return date_Update;
	}

	public void setDate_Update(Date date_Update) {
		this.date_Update = date_Update;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		
}
