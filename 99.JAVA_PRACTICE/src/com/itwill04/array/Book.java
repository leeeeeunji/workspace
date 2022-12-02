package com.itwill04.array;
/*
 * - 캡슐화하세요
 * - 생성자를 정의하세요
 */
public class Book {
	/*
	 *  <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 */
	private int no;
	private String title;
	private String div;
	private String exp;
	
	
	public Book() {

	}

	public Book(int no, String title, String div, String exp) {
		super();
		this.no = no;
		this.title = title;
		this.div = div;
		this.exp = exp;
	}
	
	/*
	 *  <<기능>>
	 *  책정보출력
	 */
	public void print() {
		System.out.print(this.no + "\t" + this.title + "\t" + this.div + "\t" + this.exp);
	
		
	
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}
}
