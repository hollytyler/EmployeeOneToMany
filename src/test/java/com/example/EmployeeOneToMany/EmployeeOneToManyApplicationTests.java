package com.example.EmployeeOneToMany;
import com.example.EmployeeOneToMany.models.Department;
import com.example.EmployeeOneToMany.models.Employee;
import com.example.EmployeeOneToMany.models.Project;
import com.example.EmployeeOneToMany.repositories.DepartmentRepository;
import com.example.EmployeeOneToMany.repositories.EmployeeRepository;
import com.example.EmployeeOneToMany.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;
import java.util.ArrayList;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
class EmployeeOneToManyApplicationTests {

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
	public void addEmployeeToDepartment(){
		Employee employee = new Employee("George", "Tegos", "37495l");
		Employee employee1 = new Employee("Holly", "Tyler", "7098435P");
		Department department = new Department("Software Devs");
		departmentRepository.save(department);
		employee.setDepartment(department);
		employee1.setDepartment(department);
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(employee);
		list.add(employee1);
		department.addEmployees(list);
	}

	@Test
	public void assignProjectToEmployee(){
		Employee employee = new Employee("George", "Tegos", "37495l");
		Employee employee1 = new Employee("Holly", "Tyler", "7098435P");
		Department department = new Department("Software Devs");
		departmentRepository.save(department);
		employee.setDepartment(department);
		employee1.setDepartment(department);
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(employee);
		list.add(employee1);
		department.addEmployees(list);
		Project project = new Project("Java", 5);
		Project project1 = new Project("JavaScript", 6);
		projectRepository.save(project);
		projectRepository.save(project1);
		employee.assignProject(project);
		employee.assignProject(project1);
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
	}
}
