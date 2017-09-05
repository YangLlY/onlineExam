package cn.edu.zjnu.OnlineExam.Service;

import cn.edu.zjnu.OnlineExam.Base.DaoSupport;
import cn.edu.zjnu.OnlineExam.Beans.ExamPage;

import java.util.List;

public interface ExamPageService extends DaoSupport<ExamPage> {
	List<ExamPage> findByAUID(Integer auID);
}
