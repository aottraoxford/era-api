package com.eracambodia.era.model.api_agent_favorite_add.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AgentAddFavorite {
    @JsonIgnore
    private int userId;
    private int ownerId;
    private String tableName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "AgentAddFavorite{" +
                "ownerId=" + ownerId +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
