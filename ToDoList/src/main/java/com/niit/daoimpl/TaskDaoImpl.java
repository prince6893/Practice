package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.dao.TaskDao;
import com.niit.model.Task;

@Repository
@Transactional
public class TaskDaoImpl implements TaskDao {
	@Autowired
	private SessionFactory sessiofactory;

	public List<Task> getTaskList() {
		Session session = sessiofactory.getCurrentSession();
		Query query = session.createQuery("from Task");
		List<Task> taskList = query.list();
		session.flush();

		return taskList;

	}

	public void addTask(Task task) {
		Session session = sessiofactory.getCurrentSession();
		session.saveOrUpdate(task);
		session.flush();
	}

	public void editTask(Task task) {
		Session session = sessiofactory.getCurrentSession();
		session.saveOrUpdate(task);
		session.flush();
	}

	public void deleteTask(Task task) {
		Session session = sessiofactory.getCurrentSession();
		session.saveOrUpdate(task);
		session.flush();
	}

	public Task getTaskById(int id) {
		Session session = sessiofactory.getCurrentSession();
		Task task = (Task) session.get(Task.class, id);
		session.flush();

		return task;

	}

}
