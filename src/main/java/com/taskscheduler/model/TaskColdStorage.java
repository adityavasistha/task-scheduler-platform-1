package com.taskscheduler.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("tasks")
public class Task {
    @PrimaryKey
    @Column("id")
    private String id;
    
    @Column("tenant")
    private String tenant;
    
    @Column("payload")
    private String payload;
    
    @Column("scheduled_at")
    private Long scheduledAt;
    
    @Column("status")
    private String status;
}
