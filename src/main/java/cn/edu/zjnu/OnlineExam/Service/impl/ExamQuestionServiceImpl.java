package cn.edu.zjnu.OnlineExam.Service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.edu.zjnu.OnlineExam.Beans.ExamQuestion;
import cn.edu.zjnu.OnlineExam.Dao.ExamQuestionDao;
import cn.edu.zjnu.OnlineExam.Service.ExamQuestionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("examQuestionService")
@Transactional
public class ExamQuestionServiceImpl implements ExamQuestionService {

	@Resource
	private ExamQuestionDao examQuestionDao;
	
	public List<ExamQuestion> findAll() {
		return examQuestionDao.findAll();
	}

	public ExamQuestion findById(Integer id) {
		return examQuestionDao.findById(id);
	}

	public void add(ExamQuestion t) {
		examQuestionDao.add(t);
	}

	public void delete(Integer id) {
		examQuestionDao.delete(id);
	}

	public void update(ExamQuestion t) {
		examQuestionDao.update(t);
	}

	public long findByPageID(Integer id) {
		return examQuestionDao.findByPageID(id);
	}

	public List<ExamQuestion> findByEpID(Integer epId) {
		return examQuestionDao.findByEpID(epId);
	}

	public String findTotalScoreByid(Integer id) {
		return examQuestionDao.findTotalScoreByid(id);
	}

}
