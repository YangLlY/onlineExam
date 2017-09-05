package cn.edu.zjnu.OnlineExam.Service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.edu.zjnu.OnlineExam.Beans.StuClass;
import cn.edu.zjnu.OnlineExam.Dao.StuClassDao;
import cn.edu.zjnu.OnlineExam.Service.StuClassService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("stuClassService")
@Transactional
public class StuClassServiceImpl implements StuClassService {

	@Resource
	private StuClassDao stuClassDao;
	
	public List<StuClass> findAll() {
		return stuClassDao.findAll();
	}

	public StuClass findById(Integer id) {
		return stuClassDao.findById(id);
	}

	public void add(StuClass t) {
		stuClassDao.add(t);
	}

	public void delete(Integer id) {
		stuClassDao.delete(id);
	}

	public void update(StuClass t) {
		stuClassDao.update(t);
	}
	

}
