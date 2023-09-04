package com.hcl.taskmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.taskmanager.model.Task;
import com.hcl.taskmanager.repository.TaskRepository;

@Service
public class TaskServiceImp implements ITaskService {

	@Autowired
	TaskRepository repo;

	@Override
	public Task addTask(Task task) {

		return repo.save(task);
	}

	@Override
	public Task updateTask(Task task) {

		return repo.save(task);
	}

	@Override
	public Task getTaskById(long tid) {

		return repo.findById(tid).orElse(null);
	}

	@Override
	public String deleteTaskById(long tid) {

		repo.deleteById(tid);
		return "Record deleted successfully..";
	}

	@Override
	public List<Task> getAllTasks() {

		return repo.findAll();
	}

	@Override
	public Task getTaskByName(String tname) {

		return repo.findByTaskName(tname);
	}

}
