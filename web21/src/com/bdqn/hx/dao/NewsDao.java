package com.bdqn.hx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.hx.entity.News;

public class NewsDao extends BaseDao{
	public List<News> getList(){
		ResultSet rs = executeQuery("select * from news_detail ", null);
		List<News> list = new ArrayList<>();
		try {
			while(rs.next()){
				News n = new News();
				n.setNid(rs.getInt("id"));
				n.setNtitle(rs.getString("title"));
				n.setNauthor(rs.getString("author"));
				n.setNcreatedate(rs.getDate("createDate"));
				list.add(n);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
