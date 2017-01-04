package com.niit.dao;

import java.util.List;

import com.niit.model.Task;

public interface TaskDao {
	List<Task> getTaskList();

	void addTask(Task task);

	void editTask(Task task);

	void deleteTask(Task task);

	Task getTaskById(int id);

}
