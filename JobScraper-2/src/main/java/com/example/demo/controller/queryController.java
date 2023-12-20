package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.WorkspaceJobRepository;
import com.example.demo.WorkspaceRepository;
import com.example.demo.queryRepository;
import com.example.demo.model.AddToWorkspaceRequest;
import com.example.demo.model.QueryEntity;
import com.example.demo.model.WorkspaceJob;

@RestController
@RequestMapping("/queries")
 public class queryController {
	  @Autowired
	    private queryRepository querYRepository;
	 

	    @PostMapping("/add")
	    public ResponseEntity<String> addQuery(@RequestBody QueryEntity query) {
	        querYRepository.save(query);
	        return ResponseEntity.ok("Query added successfully!");
	    }

	    @GetMapping("/getAll")
	    public ResponseEntity<List<QueryEntity>> getAllQueries() {
	        List<QueryEntity> queries = querYRepository.findAll();
	        return ResponseEntity.ok(queries);
	    }
	   
}
