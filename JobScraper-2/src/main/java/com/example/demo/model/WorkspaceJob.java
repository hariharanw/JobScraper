package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "workspace_job")
public class WorkspaceJob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "workspace_id", nullable = false)
    private Workspace workspace;

    @ManyToOne
    @JoinColumn(name = "query_id", nullable = false)
    private QueryEntity queryentity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Workspace getWorkspace() {
        return workspace;
    }

    public void setWorkspace(Workspace workspace) {
        this.workspace = workspace;
    }

  

    public QueryEntity getQueryentity() {
		return queryentity;
	}

	public void setQueryentity(QueryEntity queryentity) {
		this.queryentity = queryentity;
	}

	public WorkspaceJob() {
    }

    // Constructor without ID for creation
    public WorkspaceJob(Workspace workspace, QueryEntity queryentity) {
        this.workspace = workspace;
        this.queryentity = queryentity;
    }
}
