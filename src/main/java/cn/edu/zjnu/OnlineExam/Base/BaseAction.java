package cn.edu.zjnu.OnlineExam.Base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import cn.edu.zjnu.OnlineExam.Service.*;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by yly on 2017/6/2.
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
	
	private static final long serialVersionUID = 1L;

	@Resource
	protected AdminUserService adminUserService;
	@Resource
	protected ExamPageService examPageService;
	@Resource
	protected StuClassService stuClassService;
	@Resource
	protected StudentService studentService;
	@Resource
	protected StuScoreService stuScoreService;
	@Resource
	protected ExamQuestionService examQuestionService;
	
	protected T model;
	
	//在构造方法中根据反射来得到放方法真正的类型
	public BaseAction() {
		try {
			ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) type.getActualTypeArguments()[0];
			model = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
	public T getModel() {
		return model;
	}
}
