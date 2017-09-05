package cn.edu.zjnu.OnlineExam.Dao;

import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.StuScore;

import java.util.List;

/**
 * Created by yly on 2017/6/2.
 */
public interface StuScoreDao extends DaoSupport<StuScore> {
	List<StuScore> findBySutId(Integer id);
}	
