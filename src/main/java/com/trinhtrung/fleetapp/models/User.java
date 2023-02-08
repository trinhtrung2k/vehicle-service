package com.trinhtrung.fleetapp.models;

import javax.persistence.*;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int id;
	private String username;
	private String password;
	
}