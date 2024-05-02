package com.main.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDto {

	private int ProblemId;
	private String ResourceDescription;
	private String status;
	
}
