package cn.edu.zjnu.OnlineExam.Base;

import java.util.List;

/**
 * Created by yly on 2017/6/2.
 */
public interface DaoSupport<T> {
	//返回全部的
	List<T> findAll();
	//根据id返回一个
	T findById(Integer id);
	//添加
	void add(T t);
	//删除
	void delete(Integer id);
	//更新
	void update(T t);
	
}
