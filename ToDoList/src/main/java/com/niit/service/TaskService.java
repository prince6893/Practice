package com.niit.service;

import java.util.List;

import com.niit.model.Task;

public interface TaskService {
	List<Task> getTaskList();

	void addTask(Task task);

	void editTask(Task task);

	void deleteTask(Task task);

	Task getTaskById(int id);


}
