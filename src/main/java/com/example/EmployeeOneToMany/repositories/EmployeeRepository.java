package com.example.EmployeeOneToMany.repositories;
import com.example.EmployeeOneToMany.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
