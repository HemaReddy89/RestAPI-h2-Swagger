package com.ASOS.Training.RestAPIh2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ASOS.Training.RestAPIh2.model.Employee;
import com.ASOS.Training.RestAPIh2.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public Employee addEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	public List<Employee> addEmployees(List<Employee> employee)
	{
		return employeeRepository.saveAll(employee);
		
	}
	
	public Employee getEmployeeById(int id)
	{
		return employeeRepository.findById(id).orElse(null);
	
	}
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
		
	}
	
	public void updateEmployee(Employee employee)
	{
		employeeRepository.save(employee);
		
	}
	public void deleteEmployee(int id)
	{
	 employeeRepository.deleteById(id);
		
	}
}
