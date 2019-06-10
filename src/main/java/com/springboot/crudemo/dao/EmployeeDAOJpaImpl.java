package com.springboot.crudemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.crudemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl (EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		
		// CREATE A QUERY
		Query theQuery = this.entityManager.createQuery("from Employee");
		
		// EXECUTE QUERY AND GET RESULT LIST
		List<Employee> employees = theQuery.getResultList();
		
		//RETURN THE RESULT
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		
		return null;
	}

	@Override
	public void addEmployee(Employee theEmployee) {
		
		
	}

	@Override
	public void deleteEmployeeById(int theId) {
		
		
	}

}
