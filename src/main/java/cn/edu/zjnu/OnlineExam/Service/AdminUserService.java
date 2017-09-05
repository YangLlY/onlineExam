package cn.edu.zjnu.OnlineExam.Service;


import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.AdminUser;

public interface AdminUserService extends DaoSupport<AdminUser> {
	AdminUser findAdminUserByUsernameAndPassword(String username, String password);
	AdminUser findAdminUserByUserName(String username);
	AdminUser findAdminUserByUUID(String uuid);
}
