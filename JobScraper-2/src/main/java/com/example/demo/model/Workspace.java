package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workspace {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "workspace_id")
	    private Long workspaceId;

	  @Column(name = "workspace")
    private String name;

	public Long getId() {
		return workspaceId;
	}

	public void setId(Long id) {
		this.workspaceId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
    
}