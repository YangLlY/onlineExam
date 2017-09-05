package cn.edu.zjnu.OnlineExam.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import cn.edu.zjnu.OnlineExam.Beans.ExamQuestion;
import cn.edu.zjnu.OnlineExam.Beans.StuScore;
import cn.edu.zjnu.OnlineExam.Beans.Student;
import cn.edu.zjnu.OnlineExam.Service.ExamPageService;
import cn.edu.zjnu.OnlineExam.Service.ExamQuestionService;
import cn.edu.zjnu.OnlineExam.Service.StuScoreService;
import cn.edu.zjnu.OnlineExam.Utils.GetExamScore;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by yly on 2017/6/2.
 */
@Controller
@Scope("prototype")
public class ExamScoreAction extends ActionSupport {
	
	@Resource
	private ExamQuestionService examQuestionService;
	@Resource
	private ExamPageService examPageService;
	@Resource
	private StuScoreService stuScoreService;
	
	private Integer epId;
	private static final long serialVersionUID = 1L;

	public String saveScore() throws Exception {
		List<ExamQuestion> eqList = examQuestionService.findByEpID(epId);
		Map<String, Object> map = ActionContext.getContext().getParameters();
		List<String> resList = new ArrayList<String>();
		if(eqList.size()+1==map.size()){
			long res = GetExamScore.getScore(eqList, resList,map);
			StuScore ss = new StuScore();
			ss.setExamPage(examPageService.findById(epId));
			Student s = (Student) ActionContext.getContext().getSession().get("studentUser");
			ss.setStudent(s);
			ss.setSocre(res);
			System.out.println(GetExamScore.getResultString(resList.toString()));
			ss.setStuResult(GetExamScore.getResultString(resList.toString()));
			stuScoreService.add(ss);
			ActionContext.getContext().put("message", "得分："+res);
			return "examInfo";
		}else{
			ActionContext.getContext().put("message", "请回答所有题目！");
			return "examInfo";
		}
	}

	public Integer getEpId() {
		return epId;
	}

	public void setEpId(Integer epId) {
		this.epId = epId;
	}
	
}
