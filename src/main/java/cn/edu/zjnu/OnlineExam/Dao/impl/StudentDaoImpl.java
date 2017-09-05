package cn.edu.zjnu.OnlineExam.Dao.impl;

import cn.edu.zjnu.OnlineExam.Base.DaoSupportImpl;
import cn.edu.zjnu.OnlineExam.Beans.Student;
import cn.edu.zjnu.OnlineExam.Dao.StudentDao;
import cn.edu.zjnu.OnlineExam.Utils.MD5EncodingUtil;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl extends DaoSupportImpl<Student> implements StudentDao {

	public Student findByPhone(String phone) {
		return (Student) getSession().createQuery("FROM student s WHERE s.phone=:phone").setString("phone", phone).uniqueResult();
	}

	public Student findByUserName(String username) {
		return (Student) getSession().createQuery("FROM student s WHERE s.username=:username").setString("username", username).uniqueResult();
	}

	public Student findByUSernameAndPassword(String username, String password) {
		return (Student) getSession().createQuery("FROM student s WHERE s.username=:username AND s.password=:password").setString("username", username).setString("password", MD5EncodingUtil.getMD5(password)).uniqueResult();
	}

}
