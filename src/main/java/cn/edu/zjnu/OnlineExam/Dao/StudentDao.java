package cn.edu.zjnu.OnlineExam.Dao;

import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.Student;

/**
 * Created by yly on 2017/6/2.
 */
public interface StudentDao extends DaoSupport<Student> {
	Student findByPhone(String phone);
	Student findByUserName(String username);
	Student findByUSernameAndPassword(String username, String password);
}
