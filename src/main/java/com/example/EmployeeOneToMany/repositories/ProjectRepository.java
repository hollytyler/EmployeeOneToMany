package com.example.EmployeeOneToMany.repositories;
import com.example.EmployeeOneToMany.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
