package cn.edu.zjnu.OnlineExam.Dao.impl;

import java.util.List;

import cn.edu.zjnu.OnlineExam.Base.DaoSupportImpl;
import cn.edu.zjnu.OnlineExam.Beans.StuScore;
import cn.edu.zjnu.OnlineExam.Dao.StuScoreDao;
import org.springframework.stereotype.Repository;

@Repository("stuScoreDao")
public class StuScoreDaoImpl extends DaoSupportImpl<StuScore> implements StuScoreDao {

	public List<StuScore> findBySutId(Integer id) {
		return getSession().createQuery("FROM StuScore s WHERE s.student.id=:id").setInteger("id", id).list();
	}

}
