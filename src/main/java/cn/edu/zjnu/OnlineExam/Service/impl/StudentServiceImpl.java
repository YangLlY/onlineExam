
package cn.edu.zjnu.OnlineExam.Service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.edu.zjnu.OnlineExam.Beans.Student;
import cn.edu.zjnu.OnlineExam.Dao.StudentDao;
import cn.edu.zjnu.OnlineExam.Service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDao studentDao;
	
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	public Student findById(Integer id) {
		return studentDao.findById(id);
	}

	public void add(Student t) {
		studentDao.add(t);
	}

	public void delete(Integer id) {
		studentDao.delete(id);
	}

	public void update(Student t) {
		studentDao.update(t);
	}

	public Student findByPhone(String phone) {
		return studentDao.findByPhone(phone);
	}

	public Student findByUserName(String username) {
		return studentDao.findByUserName(username);
	}

	public Student findByUSernameAndPassword(String username, String password) {
		return studentDao.findByUSernameAndPassword(username, password);
	}

}
