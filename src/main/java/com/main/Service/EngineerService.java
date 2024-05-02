package com.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Repository.EngineerRepository;
import com.main.model.EngineerModel;

@Service
public class EngineerService<Engineer, S> {
    @Autowired
    private EngineerRepository engineerRepository;
    
    public List<EngineerModel> getAllEngineers() {
        return engineerRepository.findAll();
    }
    
    public EngineerModel getEngineerById(Integer id) {
        return engineerRepository.findById(id).orElse(null);
    }
    
    @SuppressWarnings({ "unchecked", "unchecked" })
	public Engineer createEngineer(Engineer engineer) {
        return (Engineer) engineerRepository.saves((Iterable<S>) engineer);
    }
    
    public EngineerModel updateEngineer(Integer id, Engineer updatedEngineer) {
        EngineerModel existingEngineer = engineerRepository.findById(id).orElse(null);
        if (existingEngineer != null) {
            existingEngineer.setUsername(((EngineerModel) updatedEngineer).getUsername());
            existingEngineer.setPassword(((EngineerModel) updatedEngineer).getPassword());
            existingEngineer.setCategory(((EngineerModel) updatedEngineer).getCategory());
            return engineerRepository.save(existingEngineer);
        }
        return null;
    }
    
    public void deleteEngineer(Integer id) {
        engineerRepository.deleteById(id);
    }
}
