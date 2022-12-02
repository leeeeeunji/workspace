package com.itwill04.array;
/*
	- 캡슐화
 */
public class BookMember {
	/*
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int no;
	private String name;
	private int num;
	private Book rentBook;
	
	public BookMember() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BookMember(int no, String name, int num, Book rentBook) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
		this.rentBook = rentBook;
	}


	/*
	<<기능>>
	  회원정보출력 
	 */
	public void memprint() {
		System.out.print(this.no + "\t" + this.name + "\t" + this.num + "\t" + this.rentBook + "\t");
		
		
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Book getRentBook() {
		return rentBook;
	}
	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}
}
