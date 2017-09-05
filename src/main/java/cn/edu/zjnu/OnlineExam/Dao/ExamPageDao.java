package cn.edu.zjnu.OnlineExam.Dao;

import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.ExamPage;

import java.util.List;
/**
 * Created by yly on 2017/6/2.
 */
public interface ExamPageDao extends DaoSupport<ExamPage>{
	List<ExamPage> findByAUID(Integer auID);
}
