package kr.co.dhflour.guestbook.dao.test;

import java.util.List;

import kr.co.dhflour.guestbook.dao.GuestBookDao;
import kr.co.dhflour.guestbook.vo.GuestBookVo;

public class GuestBookDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insertTest();
		//deleteTest();
		fetchListTest();
	}
	
	//row list Return
	public static void fetchListTest() {
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.fetchList();
		
		//순회2 foreach문
		for(GuestBookVo vo:list) {
			System.out.println(vo.toString());
		}
	}
	
	//row Insert
	public static void insertTest() {
		
		GuestBookDao dao = new GuestBookDao();
		GuestBookVo vo = new GuestBookVo();
		boolean result = false;
		vo.setName("President");
		vo.setPassword("1234");
		vo.setContents("First is people");
		result = dao.insertVo(vo);
		
		if(result) {
			System.out.println(vo.getName() + "님의 글이 게시되었습니다.");
		} else {
			System.out.println("입력오류 -_-");
		}
	}
	
	public static void deleteTest() {
		
		GuestBookDao dao = new GuestBookDao();
		GuestBookVo vo = new GuestBookVo();
		boolean result = false;
		vo.setNo(3);
		vo.setPassword("1234");
		vo.setName("Dalsim");
		result = dao.deleteVo(vo);
		
		if(result) {
			System.out.println(vo.getName() + "님의 글이 삭제되었습니다.");
		} else {
			System.out.println("입력오류 -_-");
		}
	}

}
