package com.hcl.taskmanager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.taskmanager.model.Task;
import com.hcl.taskmanager.service.ITaskService;


@RequestMapping("/tasks")
@RestController
public class TaskController {
	
	
	@Autowired
	ITaskService service;

	@PostMapping("/add")
	public Task add(@RequestBody Task task) {
		
	
		return service.addTask(task);
	}

	@PutMapping("/update")
	public Task update(@RequestBody Task task) {

		return service.updateTask(task);
	}

	@GetMapping("/get/{tid}")
	public Task getById(@PathVariable long tid) {

		return service.getTaskById(tid);
	}

	@DeleteMapping("/delete/{tid}")
	public String deleteById(@PathVariable long tid) {

		return service.deleteTaskById(tid);
	}

	@GetMapping("/getall")
	public List<Task> getAllTasks() {

		return service.getAllTasks();
	}

	@GetMapping("/getbyname/{tname}")
	public Task getByName(@PathVariable String tname) {

		return service.getTaskByName(tname);
	} 
	
}
