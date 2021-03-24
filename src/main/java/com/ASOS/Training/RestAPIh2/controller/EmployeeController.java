package com.ASOS.Training.RestAPIh2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ASOS.Training.RestAPIh2.model.Employee;
import com.ASOS.Training.RestAPIh2.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/emp")
	public List<Employee> retrieveAllEmployee(){
    	return employeeService.getAllEmployees();
	}
	
	@GetMapping("/emp/{id}")
	public Employee retriveEmployee(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	@PostMapping("/addemployee")
	public Employee createEmployee(@RequestBody Employee employee)
    {
	   return employeeService.addEmployee(employee); 	
    }
	@PostMapping("/addemployees")
	public List<Employee> createEmployees(@RequestBody List<Employee> employee)
	{
		return employeeService.addEmployees(employee);
	}	
	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
	  employeeService.updateEmployee(employee);
	  return employee;		
	}
	@DeleteMapping("/emp/{id}")
	public void deleteEmployeeById(@PathVariable int id)
	{
		employeeService.deleteEmployee(id);
	}
	
	

}
