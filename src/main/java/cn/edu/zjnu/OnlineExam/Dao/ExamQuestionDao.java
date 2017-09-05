package cn.edu.zjnu.OnlineExam.Dao;

import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.ExamQuestion;

import java.util.List;

/**
 * Created by yly on 2017/6/2.
 */
public interface ExamQuestionDao extends DaoSupport<ExamQuestion>{
	long findByPageID(Integer id);
	List<ExamQuestion> findByEpID(Integer epId);
	String findTotalScoreByid(Integer id);
}
