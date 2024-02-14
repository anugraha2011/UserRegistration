package com.Service;

import java.util.List;

import javax.persistence.Query;

import com.Helper.Connections;
import com.UserEntity.UserInfo;

public class LoginService {
	
	public static String loginValidation(String username, String password) {
		String qy="select u from UserInfo u where u.username=?1 and u.password=?2";
		Query query=Connections.manager.createQuery(qy);
		query.setParameter(1, username);
		query.setParameter(2, password);
		
		List<UserInfo> list=query.getResultList();
		if(list!=null) {
			for(UserInfo u:list) {
				if(u.getRole().equalsIgnoreCase("Manager")) {
					return "Manager";
				}else if(u.getRole().equalsIgnoreCase("Employee")){
					return "Employee";
				}
			}
		}
		return null;
	}

}
