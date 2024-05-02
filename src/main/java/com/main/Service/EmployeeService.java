package com.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Repository.EmployeeRepo;
import com.main.dto.EmployeeDto;
import com.main.model.EmployeeModel;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepository;
    
    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public EmployeeModel getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }
    
    public EmployeeDto createEmployee(EmployeeDto employee) {
        return employeeRepository.save(employee);
    }
    
    public EmployeeModel updateEmployee(Integer id, EmployeeDto updatedEmployee) {
        EmployeeModel existingEmployee = employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setUsername(updatedEmployee.getUsername());
            existingEmployee.setPassword(updatedEmployee.getPassword());
            return employeeRepository.save(existingEmployee);
        }
        return null;
    }
    
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

	public String register(EmployeeDto cDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
