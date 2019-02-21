package org.spring.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.spring.dao.EmployeesDAO;
import org.spring.domain.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {

	@Autowired
	EmployeesDAO EMPLOYEES_DAO;

	public JSONArray list() {

		JSONArray array = new JSONArray();
		List<Employees> employeesList = EMPLOYEES_DAO.findAll();
		
		
		for (Employees employees : employeesList) {

			JSONObject json = new JSONObject();

			json.put("emp_no", employees.getEmp_no());
			json.put("last_name", employees.getLast_name());
			json.put("first_name", employees.getFirst_name());
			json.put("birth_date", employees.getBirth_date());
			json.put("hire_date", employees.getHire_date());
			json.put("gender", employees.getGender());
			array.put(json);
			
		}
		
		
		return array;

	}

}
