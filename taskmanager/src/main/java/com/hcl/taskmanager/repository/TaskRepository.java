package com.hcl.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hcl.taskmanager.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task ,Long> {

	Task findByTaskName(String tname);
	
}
