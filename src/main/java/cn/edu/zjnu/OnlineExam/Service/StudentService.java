package cn.edu.zjnu.OnlineExam.Service;

import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.Student;

public interface StudentService extends DaoSupport<Student> {
	Student findByPhone(String phone);
	Student findByUserName(String username);
	Student findByUSernameAndPassword(String username, String password);
}
