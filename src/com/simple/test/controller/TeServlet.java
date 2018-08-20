package com.simple.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simple.test.common.Utils;
import com.simple.test.service.TeService;
import com.simple.test.service.impl.TeServiceImpl;
import com.simple.test.vo.TeInfo;

public class TeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TeService ts = new TeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String cmd = Utils.getCmd(uri);
		try {
			if (cmd.equals("teList")) {
				String type = request.getParameter("teType");
				String text = request.getParameter("teText");
				TeInfo ti = null;
				if (text != null) {
					ti = new TeInfo();
					if (type.equals("teNum")) {
						ti.setTeNum(Integer.parseInt(text));
					} else if (type.equals("teName")) {
						ti.setTeName(text);
					} else if (type.equals("teId")) {
						ti.setTeId(text);
					} else if (type.equals("teDesc")) {
						ti.setTeDesc(text);
					}
				}
				request.setAttribute("tiList", ts.getTeList(ti));
			} else if (cmd.equals("teView")) {
				String teNum = request.getParameter("teNum");
				System.out.println(teNum);
				request.setAttribute("teInfo", ts.getTeOne(Integer.parseInt(teNum)));
			} else if (cmd.equals("teInsert")) {
				String teName = request.getParameter("name");
				String teId = request.getParameter("id");
				String teDesc = request.getParameter("desc");
				
				if (teName == null || teName.equals("") || teId == null || teId.equals("")) {
					request.setAttribute("err", "값이 제대루 안왓어..");
				}
				TeInfo ti = new TeInfo();
				ti.setTeName(teName);
				ti.setTeId(teId);
				ti.setTeDesc(teDesc);
				System.out.println(request.getRequestURL());
				int rCnt = ts.insertTe(ti);
				System.out.println(rCnt);
				if(rCnt==1) {
					request.setAttribute("teIn","성공적으로 등록했어요.");
					uri = uri.replace(cmd, "teList");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		uri = "/views" + uri;
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
