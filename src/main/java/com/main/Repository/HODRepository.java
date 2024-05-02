package com.main.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.HODModel;

@Repository
public interface HODRepository<S> extends JpaRepository<HODModel, Integer> {

	<HOD> HOD savess(S hod);

	
	
	
	
	

	
	

	
	

	
	
}
