package com.main.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.main.dto.EmployeeDto;
import com.main.model.EmployeeModel;


@Repository
public interface EmployeeRepo extends  JpaRepository<EmployeeModel, Integer> {

	
	EmployeeDto save(EmployeeDto employee);

}
