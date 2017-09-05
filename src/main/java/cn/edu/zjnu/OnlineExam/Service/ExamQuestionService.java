package cn.edu.zjnu.OnlineExam.Service;

import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.ExamQuestion;

import java.util.List;

public interface ExamQuestionService extends DaoSupport<ExamQuestion> {
	long findByPageID(Integer id);
	List<ExamQuestion> findByEpID(Integer epId);
	String findTotalScoreByid(Integer id);
	
}
