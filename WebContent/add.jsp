<%@page import="kr.co.dhflour.guestbook.vo.GuestBookVo"%>
<%@page import="kr.co.dhflour.guestbook.dao.GuestBookDao"%>
<%
	request.setCharacterEncoding("utf-8"); //post방식 시 Encoding
	
	String name = request.getParameter("name");
	String password = request.getParameter("pass");
	String contents = request.getParameter("content");
	
	GuestBookVo vo = new GuestBookVo();
	GuestBookDao dao = new GuestBookDao();
	
	vo.setName(name);
	vo.setPassword(password);
	vo.setContents(contents);
	
	boolean result = dao.insertVo(vo);
	
	if (result){
		response.sendRedirect("/guestbook");
	}
	
%>