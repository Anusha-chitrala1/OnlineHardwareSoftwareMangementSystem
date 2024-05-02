package com.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Repository.HODRepository;
import com.main.model.HODModel;

@Service
public class HODService<HOD> {
    
    @Autowired
    private HODRepository hodRepository;
    
    @SuppressWarnings("unchecked")
	public List<HOD> getAllHODs() {
        return (List<HOD>) hodRepository.findAll();
    }
    
    public HODModel getHODById(Integer id) {
        return (HODModel) hodRepository.findById(id).orElse(null);
    }
    
    @SuppressWarnings("unchecked")
    public HOD createHOD(HOD hod) {
        return (HOD) hodRepository.save(hod);
    }

	
    
    @SuppressWarnings("unchecked")
	public HOD updateHOD(Integer id, HOD updatedHOD) {
        HODModel existingHOD = (HODModel) hodRepository.findById(id).orElse(null);
        if (existingHOD != null) {
            existingHOD.setUsername(((HODModel) updatedHOD).getUsername());
            existingHOD.setPassword(((HODModel) updatedHOD).getPassword());
            return (HOD) hodRepository.save(existingHOD);
        }
        return null;
    }
    
    public void deleteHOD(Integer id) {
        hodRepository.deleteById(id);
    }
}
