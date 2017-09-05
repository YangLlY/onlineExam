package cn.edu.zjnu.OnlineExam.Action;

import java.util.List;

import cn.edu.zjnu.OnlineExam.Base.BaseAction;
import cn.edu.zjnu.OnlineExam.Beans.StuScore;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

/**
 * Created by yly on 2017/6/2.
 */
@Controller
@Scope("prototype")
public class StuScoreAction extends BaseAction<StuScore> {

	private static final long serialVersionUID = 1L;
	

	public String delete() throws Exception {
		StuScore ss = stuScoreService.findById(model.getId());
		if(ss==null){
			ActionContext.getContext().put("message", "删除失败！");
		}else{
			stuScoreService.delete(model.getId());
			
		}
		return listAll();
	}
	
	public String listAll() throws Exception {
		List<StuScore> ssList = stuScoreService.findAll();
		ActionContext.getContext().put("ssList", ssList);
		return "listAll";
	}
	
}
