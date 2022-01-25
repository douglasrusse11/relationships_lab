package com.codeclan.example.relationships_lab;

import com.codeclan.example.relationships_lab.models.Department;
import com.codeclan.example.relationships_lab.models.Employee;
import com.codeclan.example.relationships_lab.models.Project;
import com.codeclan.example.relationships_lab.repositories.DepartmentRepository;
import com.codeclan.example.relationships_lab.repositories.EmployeeRepository;
import com.codeclan.example.relationships_lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RelationshipsLabApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test

	public void createEmployeesDepartmentsAndProject(){

		Department department = new Department("Mapping");
		departmentRepository.save(department);

		Employee employee = new Employee("Keith", "Douglas", 78978924, department);
		employeeRepository.save(employee);

		Project project = new Project("Finish Land Register", 8739857);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);


	}

}
