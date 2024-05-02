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
public class ProblemModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int ProblemId;
	private String ResourceDescription;
	@SuppressWarnings("unused")
	private String Status;
	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
