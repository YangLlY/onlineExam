package cn.edu.zjnu.OnlineExam.Utils;

import cn.edu.zjnu.OnlineExam.Beans.ExamQuestion;

import java.util.List;
import java.util.Map;


/**
 * 
 * @ClassName:GetExamScore.java
 *
 */
public class GetExamScore {
	public static long getScore(List<ExamQuestion> eqList, List<String> resList, Map<String, Object> map){
		long count = 0;
		for (String key : map.keySet()) {
			String[] str = (String[]) map.get(key);
			if(str.length==1){
				resList.add(str[0]);
			}else{
				String flag = "";
				for(int i=0;i<str.length;i++){
					if(i==str.length-1){
						flag += str[i];
					}else{
						flag += str[i]+",";
					}
				}
				resList.add(flag);
			}
		}
		
		for (int i = 0; i < eqList.size(); i++) {
			if(eqList.get(i).getQuestionResult().equals(resList.get(i+1))){
				count += Long.parseLong(eqList.get(i).getQuestionScore());
			}
		}
		return count;
	}
	
	public static String getResultString(String str){
		str = str.substring(4,str.length()-1);
		String[] s = str.split(" ");
		String ss = "";
		for(int i=0;i<s.length;i++){
			ss+=(i+1)+".["+s[i].replaceAll(",", "")+"] ";
		}
		return ss;
	}
}
