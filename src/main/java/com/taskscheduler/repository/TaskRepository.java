package com.taskscheduler.repository;

import com.taskscheduler.model.Task;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CassandraRepository<Task, String> {
    // Basic CRUD operations provided by CassandraRepository
    
    // Custom query for batch fetch using IN clause
    @Query("SELECT * FROM tasks WHERE id IN ?0")
    List<Task> findAllByIdIn(List<String> ids);
}
