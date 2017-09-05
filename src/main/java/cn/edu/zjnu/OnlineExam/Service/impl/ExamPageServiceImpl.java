package cn.edu.zjnu.OnlineExam.Service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.edu.zjnu.OnlineExam.Beans.ExamPage;
import cn.edu.zjnu.OnlineExam.Dao.ExamPageDao;
import cn.edu.zjnu.OnlineExam.Service.ExamPageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("examPageService")
@Transactional
public class ExamPageServiceImpl implements ExamPageService {
	
	@Resource
	private ExamPageDao examPageDao;
	
	public List<ExamPage> findAll() {
		return examPageDao.findAll();
	}

	public ExamPage findById(Integer id) {
		return examPageDao.findById(id);
	}

	public void add(ExamPage t) {
		examPageDao.add(t);
	}

	public void delete(Integer id) {
		examPageDao.delete(id);
	}

	public void update(ExamPage t) {
		examPageDao.update(t);
	}

	public List<ExamPage> findByAUID(Integer auID) {
		return examPageDao.findByAUID(auID);
	}

}
