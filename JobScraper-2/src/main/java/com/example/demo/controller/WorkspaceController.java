package com.example.demo.controller;



import com.example.demo.WorkspaceRepository;
import com.example.demo.model.Workspace;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Addworkspace")
public class WorkspaceController {

    @Autowired
    private WorkspaceRepository workspaceRepository;

    
    @PostMapping("/add")
    public void addWorkspace(@RequestBody Workspace workspace) {
        workspaceRepository.save(workspace);

    }
    @GetMapping("/getAll")
    public List<Workspace> getAllWorkspaces() {
        return workspaceRepository.findAll();
    }



	

   
}
