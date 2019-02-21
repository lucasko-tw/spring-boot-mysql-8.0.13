package org.spring.dao;

import java.util.List;

import org.spring.domain.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesDAO extends CrudRepository<Employees, Long> {
	Employees save(Employees employees);

	List<Employees> findAll();
}
