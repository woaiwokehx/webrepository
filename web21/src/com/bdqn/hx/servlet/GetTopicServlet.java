package com.bdqn.hx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.bdqn.hx.dao.TopicDao;
import com.bdqn.hx.entity.Topic;
@WebServlet("/GetTopicServlet")
public class GetTopicServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		TopicDao dao = new TopicDao();
		List<Topic> list = dao.getList();
		//
		//
		JSONObject obj = new JSONObject();
		obj.put("topics", list);
		resp.setContentType("application/json;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print(obj);
		out.close();
		
	}
}
