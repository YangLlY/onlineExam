package cn.edu.zjnu.OnlineExam.Dao.impl;

import cn.edu.zjnu.OnlineExam.Base.DaoSupportImpl;
import cn.edu.zjnu.OnlineExam.Beans.AdminUser;
import cn.edu.zjnu.OnlineExam.Dao.AdminUserDao;
import cn.edu.zjnu.OnlineExam.Utils.MD5EncodingUtil;
import org.springframework.stereotype.Repository;


@Repository("adminUserDao")
public class AdminUserDaoImpl extends DaoSupportImpl<AdminUser> implements AdminUserDao {

	public AdminUser findAdminUserByUsernameAndPassword(String username, String password) {
		return (AdminUser) getSession().createQuery("FROM adminuser au WHERE au.username=:username AND au.password=:password").setString("username", username).setString("password", MD5EncodingUtil.getMD5(password)).uniqueResult();
		
	}

	public AdminUser findAdminUserByUsername(String username) {
		return (AdminUser) getSession().createQuery("FROM adminuser au WHERE au.username=:username").setString("username", username).uniqueResult();
	}

	public AdminUser findAdminUserByUUID(String uuid) {
		return (AdminUser) getSession().createQuery("FROM adminuser au WHERE au.au_Desc=:auDesc").setString("auDesc", uuid).uniqueResult();
	}

}
