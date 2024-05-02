package com.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.EngineerModel;
@Repository
public interface EngineerRepository extends JpaRepository<EngineerModel, Integer> {

	<Engineer> Engineer saves(Engineer engineer);

	
   
}


