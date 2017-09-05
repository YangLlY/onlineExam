package cn.edu.zjnu.OnlineExam.Dao;


import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.AdminUser;

/**
 * Created by yly on 2017/6/2.
 */
public interface AdminUserDao extends DaoSupport<AdminUser> {
	/**
	 * @Title:        findAdminUserByUsernameAndPassword 
	 * @Description:  TODO(用户登录) 
	 * @param username
	 * @param password
	 *
	 */
	AdminUser findAdminUserByUsernameAndPassword(String username, String password);
	/**
	 * @Title:        findAdminUserByUsername 
	 * @Description:  TODO(根据用户名查询用户) 
	 * @param username
	 * @return:       AdminUser    
	 *
	 */
	AdminUser findAdminUserByUsername(String username);
	/**
	 * 
	 * @Title:        findAdminUserByUUID 
	 * @Description:  TODO(用户激活时用到) 
	 * @param uuid
	 * @return:       AdminUser    
	 *
	 */
	AdminUser findAdminUserByUUID(String uuid);
}
