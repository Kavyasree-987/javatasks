package com.hcl.taskmanager.service;

import java.util.List;


import com.hcl.taskmanager.model.Task;

public interface ITaskService {

	public Task addTask(Task task);

	public Task updateTask(Task task);

	public Task getTaskById(long tid);

	public String deleteTaskById(long tid);

	public List<Task> getAllTasks();

	public Task getTaskByName(String tname);

}
