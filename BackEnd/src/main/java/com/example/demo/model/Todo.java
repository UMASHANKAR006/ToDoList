package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "todo")
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="titolo")
	private String titolo;
	
	@Column(name="contenuto", unique=true)
	private String contenuto;
	
	@Column(name="fatto")
	private boolean fatto;
	
	@Column(name="id_utente")
	private Integer id_utente;
}
