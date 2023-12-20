package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Workspace;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
    // Add custom queries if needed
}
