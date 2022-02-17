package com.NPCI.project.transactions;
import java.util.List;

import com.NPCI.project.response.UserDepartmentResponse;
public interface UserDao {

	public List<UserDepartmentResponse> getUserDepartment();
}
