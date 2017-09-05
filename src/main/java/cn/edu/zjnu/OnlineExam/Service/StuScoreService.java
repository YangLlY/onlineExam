package cn.edu.zjnu.OnlineExam.Service;

import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.StuScore;

import java.util.List;

public interface StuScoreService extends DaoSupport<StuScore> {
	List<StuScore> findBySutId(Integer id);
}
