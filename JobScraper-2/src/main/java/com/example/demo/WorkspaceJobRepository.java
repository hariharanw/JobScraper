package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Job;
import com.example.demo.model.WorkspaceJob;

public interface WorkspaceJobRepository extends JpaRepository<WorkspaceJob, Long> {

}