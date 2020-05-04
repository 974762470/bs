package com.zc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.zc.entity.Topic;

/**
 * @date 2018-4-12
 * @author zhangC
 * 获得所有的已选课题信息
 * 根据学生id获得选题信息
 * 添加选题信息
 * 根据学生id 删除选题信息
 * 
 */

public interface ITopicDao {
	List<Topic> showAllTopic();
	@Select("select * from t_topic where studentId = #{studentId}")
	@Results({
		@Result(id = true, property = "id", column = "id"),
		@Result(property="studentId", column = "studentId"),
		@Result(property="thesisId", column="thesisId"),
		@Result(property="selectTime", column = "selectTime"),
		@Result(property="state", column = "state"),
		@Result(property = "thesisTitles", column = "thesisId", javaType = List.class, one = @One(select = "com.zc.dao.IThesisTitleDao.findById")),
	})
	List<Topic> findAll(int studentId);
	
	Topic topicByStudentId(int studentId);
	
	@Insert("insert into t_topic(thesisId, studentId, selectTime, state) values(#{thesisId}, #{studentId}, #{selectTime}, #{state})")
	void addTopic(Topic topic);
	
	int deleteTopic(int studentId);
	
	Topic getInfoByThesisId(int thesisId);
	/**
	 * 删除学生已选择的课题
	 * @param studentId
	 * @param thesisId
	 */
	@Delete("delete from t_topic where state=1 and thesisId =#{0} and studentId =#{1}")
	void deleteSelectedTopic(Integer thesisId, Integer studentId);
	
	
}
