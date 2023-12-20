package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.JobRepository;
import com.example.demo.WorkspaceJobRepository;
import com.example.demo.WorkspaceRepository;
import com.example.demo.model.AddToWorkspaceRequest;
import com.example.demo.model.Job;
import com.example.demo.model.QueryEntity;
import com.example.demo.model.Workspace;
import com.example.demo.model.WorkspaceJob;

import java.util.List;
import java.util.Optional;

import com.example.demo.queryRepository;

@Controller
@RequestMapping("/jobs")
public class JobController {

	@Autowired
    private JobRepository jobRepository;
	
	
	 @GetMapping
	    public ResponseEntity<List<Job>> getAllJobs() {
	        List<Job> jobs = jobRepository.findAll();
	        return ResponseEntity.ok(jobs);
	    }
	 
	 
	 }
	
	    