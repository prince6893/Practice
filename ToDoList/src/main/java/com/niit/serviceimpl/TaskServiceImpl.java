package com.niit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.TaskDao;
import com.niit.model.Task;
import com.niit.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskDao taskDao;

	public List<Task> getTaskList() {
		return taskDao.getTaskList();
	}

	public void addTask(Task task) {
		taskDao.addTask(task);

	}

	public void editTask(Task task) {
		taskDao.editTask(task);
	}

	public void deleteTask(Task task) {
		taskDao.deleteTask(task);
	}

	public Task getTaskById(int id) {
		return taskDao.getTaskById(id);
	}

}
