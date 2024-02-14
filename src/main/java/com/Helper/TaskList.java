package com.Helper;

import java.util.List;

import javax.persistence.Query;

import com.UserEntity.Task;
import com.UserEntity.UserInfo;

public class TaskList {
	public static List<Task> getTaskList() {
		String qy="select t from Task t order by t.status";
		Query query=Connections.manager.createQuery(qy);
		
		List<Task> taskList=query.getResultList();
		return taskList;
	}
	
	public static List<Task> getTaskListOfEmployee(String username, String password) {
		String qy="select u from UserInfo u where u.username = ?1 and u.password = ?2";
		Query query=Connections.manager.createQuery(qy);
		query.setParameter(1, username);
		query.setParameter(2, password);
		
		List<UserInfo> empList=query.getResultList();
		List<Task> taskList = null;
		for(UserInfo u : empList)
		{
			taskList = u.getTasks();
		}
		
		return taskList;
	}

	
	

}
