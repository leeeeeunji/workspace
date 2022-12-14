package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
			/*
			 * 회원객체생성
			 */
			BookMember bookMember1 = new BookMember(1, "KIM", "123-4567");
			BookMember bookMember2 = new BookMember(2, "LEE", "987-6543");
			/*
			 * 책객체들생성
			 */
			Book[] books = {new Book(1, "책1", "인문", "좋은책"),
							new Book(2, "책2", "경제", "멋진책"),
							new Book(3, "책3", "역사", "어려운책")
							};
			
			
			/*
			 * 회원이 책들 대여
			 * 
			 * 책객체들 참조변수를 회원의 멤버변수에대입
			 */
			bookMember1.setBooks(books);
			
			
			/*
			 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
			 */
			bookMember1.print();
			
	}

}
