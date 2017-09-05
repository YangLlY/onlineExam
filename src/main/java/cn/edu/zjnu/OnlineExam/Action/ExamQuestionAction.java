package cn.edu.zjnu.OnlineExam.Action;

import java.util.List;

import cn.edu.zjnu.OnlineExam.Base.BaseAction;
import cn.edu.zjnu.OnlineExam.Beans.ExamPage;
import cn.edu.zjnu.OnlineExam.Beans.ExamQuestion;
import cn.edu.zjnu.OnlineExam.Utils.StringSplit;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

/**
 * Created by yly on 2017/6/2.
 */
@Controller
@Scope("prototype")
public class ExamQuestionAction extends BaseAction<ExamQuestion> {

	private static final long serialVersionUID = 1L;
	private String epId;
	private String questionType;
	
	public String delete() throws Exception {
		ExamQuestion eq = examQuestionService.findById(model.getId());
		if(eq == null){
			return ERROR;
		}
		examQuestionService.delete(model.getId());
		return listAll();
	}
	
	public String listAll() throws Exception {
		List<ExamQuestion> eqs = examQuestionService.findAll();
		ActionContext.getContext().put("eqList", eqs);
		return "listAll";
	}
	
	public String add() throws Exception {
		ExamPage ep = examPageService.findById(Integer.parseInt(epId));
		ExamQuestion eq = new ExamQuestion();
		eq.setExamPage(ep);
		eq.setQuestionResult(model.getQuestionResult());
		eq.setQuestionTitle(model.getQuestionTitle());
		long len = examQuestionService.findByPageID(ep.getId());
		String questionString = StringSplit.getHTMLString(model.getQuestionContext(), len, questionType.trim());
		eq.setQuestionContext(model.getQuestionContext().replaceAll("\r\n", "<br/>"));
		ep.setExamContext(ep.getExamContext()+questionString);
		eq.setQuestionScore(model.getQuestionScore());
		String res = ep.getExamResult();
		res+=len+".["+eq.getQuestionResult()+"] ";
		ep.setExamResult(res);
		examPageService.update(ep);
		examQuestionService.add(eq);
		ActionContext.getContext().put("message", eq.getQuestionTitle()+":添加成功！");
		return addUI();
	}
	public String addUI() throws Exception {
		List<ExamPage> eps = examPageService.findAll();
		ActionContext.getContext().put("epList", eps);
		return "addUI";
	}
	
	
	public String getEpId() {
		return epId;
	}
	public void setEpId(String epId) {
		this.epId = epId;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	
}
