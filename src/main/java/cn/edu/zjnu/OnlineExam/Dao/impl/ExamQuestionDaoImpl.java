package cn.edu.zjnu.OnlineExam.Dao.impl;

import java.util.List;

import cn.edu.zjnu.OnlineExam.Base.DaoSupportImpl;
import cn.edu.zjnu.OnlineExam.Beans.ExamQuestion;
import cn.edu.zjnu.OnlineExam.Dao.ExamQuestionDao;
import org.springframework.stereotype.Repository;

@Repository("examQuestionDao")
public class ExamQuestionDaoImpl extends DaoSupportImpl<ExamQuestion> implements ExamQuestionDao {

	public long findByPageID(Integer id) {
		return getSession().createQuery("FROM ExamQuestion eq WHERE eq.examPage.id=:id").setInteger("id", id).list().size();
	}

	public List<ExamQuestion> findByEpID(Integer epId) {
		return getSession().createQuery("FROM ExamQuestion eq WHERE eq.examPage.id=:id").setInteger("id", epId).list();
	}

	public String findTotalScoreByid(Integer id) {
		return (String) getSession().createQuery("SELECT SUM(eq.questionScore) FROM ExamQuestion eq WHERE eq.examPage.id=:id").setInteger("id", id).uniqueResult();
	}

}
