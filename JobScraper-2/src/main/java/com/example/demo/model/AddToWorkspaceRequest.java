package com.example.demo.model;

import java.util.List;

public class AddToWorkspaceRequest {
    private Long workspaceId;
    private List<Long> queryEntityIds;  // Rename from jobIds to queryEntityIds

    public Long getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    public List<Long> getQueryEntityIds() {
        return queryEntityIds;
    }

    public void setQueryEntityIds(List<Long> queryEntityIds) {
        this.queryEntityIds = queryEntityIds;
    }
}


