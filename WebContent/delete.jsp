<%@page import="kr.co.dhflour.guestbook.vo.GuestBookVo"%>
<%@page import="kr.co.dhflour.guestbook.dao.GuestBookDao"%>
<%
	request.setCharacterEncoding("utf-8"); //post방식 시 Encoding
	
	String no = request.getParameter("no");
	String password = request.getParameter("password");
	
	GuestBookDao dao = new GuestBookDao();
	GuestBookVo vo = new GuestBookVo();
	
	vo.setNo(Long.parseLong(no));
	vo.setPassword(password);
	
	boolean result = dao.deleteVo(vo);
	
	if (result){
		response.sendRedirect("/guestbook");
	}
	
%>