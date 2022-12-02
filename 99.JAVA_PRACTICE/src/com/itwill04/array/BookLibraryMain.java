package com.itwill04.array;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember member1 = new BookMember(1, "KIM", 1234, null);
		/*
		 * 책객체생성
		 */
		Book book1 = new Book(11, "개미1", "기타", "베르나르베르베르작");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		member1.setRentBook(book1);
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		member1.memprint();

	}

}
