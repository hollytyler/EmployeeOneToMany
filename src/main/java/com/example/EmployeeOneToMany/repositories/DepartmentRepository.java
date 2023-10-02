package com.example.EmployeeOneToMany.repositories;
import com.example.EmployeeOneToMany.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
