package com.main.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EngineerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;
	private String username;
	private String email;
	private int password;
	
	public Object getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCategory(Object category) {
		// TODO Auto-generated method stub
		
	}



}
