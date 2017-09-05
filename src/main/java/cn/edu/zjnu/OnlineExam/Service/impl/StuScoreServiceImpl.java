package cn.edu.zjnu.OnlineExam.Service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.edu.zjnu.OnlineExam.Beans.StuScore;
import cn.edu.zjnu.OnlineExam.Dao.StuScoreDao;
import cn.edu.zjnu.OnlineExam.Service.StuScoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("stuScoreService")
@Transactional
public class StuScoreServiceImpl implements StuScoreService {

	@Resource
	private StuScoreDao stuScoreDao;
	
	public List<StuScore> findAll() {
		return stuScoreDao.findAll();
	}

	public StuScore findById(Integer id) {
		return stuScoreDao.findById(id);
	}

	public void add(StuScore t) {
		stuScoreDao.add(t);
	}

	public void delete(Integer id) {
		stuScoreDao.delete(id);
	}

	public void update(StuScore t) {
		stuScoreDao.update(t);
	}

	public List<StuScore> findBySutId(Integer id) {
		return stuScoreDao.findBySutId(id);
	}

}
