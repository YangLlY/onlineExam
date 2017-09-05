package cn.edu.zjnu.OnlineExam.Dao.impl;

import java.util.List;

import cn.edu.zjnu.OnlineExam.Base.DaoSupportImpl;
import cn.edu.zjnu.OnlineExam.Beans.ExamPage;
import cn.edu.zjnu.OnlineExam.Dao.ExamPageDao;
import org.springframework.stereotype.Repository;


@Repository("examPageDao")
public class ExamPageDaoImpl extends DaoSupportImpl<ExamPage> implements ExamPageDao {

	public List<ExamPage> findByAUID(Integer auID) {
		return getSession().createQuery("FROM ExamPage e WHERE e.adminUser.id=:id").setInteger("id", auID).list();
	}
}
