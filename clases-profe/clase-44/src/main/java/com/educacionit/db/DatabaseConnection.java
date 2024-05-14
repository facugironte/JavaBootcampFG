package com.educacionit.db;

import java.util.List;

import com.educacionit.db.model.User;

public interface DatabaseConnection {
	
    User getUserById(Integer userId);
    
}
