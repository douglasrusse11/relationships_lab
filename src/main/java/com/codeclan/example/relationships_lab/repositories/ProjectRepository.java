package com.codeclan.example.relationships_lab.repositories;

import com.codeclan.example.relationships_lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
