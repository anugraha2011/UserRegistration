package com.UserDao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.type.LocalDateTimeType;

import com.Helper.Connections;
import com.UserEntity.Task;
import com.UserEntity.UserInfo;

public class TaskDao {

	public static void saveTask(String task_description, int id, String task_status) {
		
		UserInfo user=Connections.manager.find(UserInfo.class, id);
		
		Task task=new Task();
		task.setTask_description(task_description);
		task.setStatus(task_status);
		
		List<Task> taskList=user.getTasks();
		taskList.add(task);
		
		user.setTasks(taskList);
		
		Connections.transaction.begin();
		Connections.manager.persist(task);
		Connections.transaction.commit();
		
		Connections.transaction.begin();
		Connections.manager.merge(user);
		Connections.transaction.commit();
		
	}
	
	public static Task updateTaskStatus(int task_id) {
		Task task=Connections.manager.find(Task.class, task_id);
		
		task.setStatus("Completed");
		
		Connections.transaction.begin();
		Connections.manager.merge(task);
		Connections.transaction.commit();
		
		return task;
	}
	

}
