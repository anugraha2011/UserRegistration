package com.Helper;

import java.util.List;

import javax.persistence.Query;

import com.UserEntity.UserInfo;

public class EmployeeList {
	public static List<UserInfo> getEmployeeList() {
		String qy="select u from UserInfo u where u.role NOT IN('manager')";
		Query query=Connections.manager.createQuery(qy);
		
		List<UserInfo> empList=query.getResultList();
		return empList;
	}

}
