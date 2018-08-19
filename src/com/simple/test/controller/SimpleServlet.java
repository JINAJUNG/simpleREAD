package com.simple.test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simple.test.common.Utils;
import com.simple.test.dao.impl.LvlDAOImpl;
import com.simple.test.service.DipartService;
import com.simple.test.service.LvlService;
import com.simple.test.service.MemService;
import com.simple.test.service.impl.DipartServiceImpl;
import com.simple.test.service.impl.LvlServiceImpl;
import com.simple.test.service.impl.MemServiceImpl;
import com.simple.test.vo.DipartInfo;
import com.simple.test.vo.LvlInfo;
import com.simple.test.vo.MemInfo;

public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MemService mis = new MemServiceImpl();
	private DipartService dis = new DipartServiceImpl();
	private LvlService lis = new LvlServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String rPath = request.getContextPath();
		String cmd = Utils.getCmd(uri);
		uri = uri.replace(rPath, "");
		uri = Utils.getPage(uri);
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter pw = response.getWriter();

		if (cmd == null || cmd.equals("")) {
			pw.println("주소가 맞을까??");
			return;
		}
		System.out.println("cmd"+cmd);
		System.out.println(uri);
		try {
			if (cmd.equals("memList")) {
				List<MemInfo> siList = mis.getSimple();
				System.out.println(siList);
				request.setAttribute("siList", siList);
				RequestDispatcher rd = request.getRequestDispatcher(uri);
				rd.forward(request, response);
				return;

			} else if (cmd.equals("dipartList")) {
				List<DipartInfo> diList = dis.getSimple();
				request.setAttribute("diList", diList);
				RequestDispatcher rd = request.getRequestDispatcher(uri);
				rd.forward(request, response);
				return;
			} else if(cmd.equals("liList")){
				List<LvlInfo> liList = lis.getSimple();
				request.setAttribute("liList", liList);
				RequestDispatcher rd = request.getRequestDispatcher(uri);
				rd.forward(request, response);
				return;
			}else {
				pw.println("안녕 나는 누구게?? 근데 이거 잘못 된 거 같앵");
				return;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
