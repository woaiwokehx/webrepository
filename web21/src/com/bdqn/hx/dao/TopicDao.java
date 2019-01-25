package com.bdqn.hx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.hx.entity.Topic;

public class TopicDao extends BaseDao{
	//查询所有主题
	public List<Topic> getList(){
		ResultSet rs = executeQuery("select * from news_category ", null);
		List<Topic> list = new ArrayList<>();
		try {
			while (rs.next()) {
				Topic t = new Topic();
				t.setTid(rs.getInt(1));
				t.setTname(rs.getString(2));
				list.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
}
