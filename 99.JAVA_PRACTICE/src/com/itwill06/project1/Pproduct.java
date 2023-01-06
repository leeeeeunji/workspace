package com.itwill06.project1;
/*
이름      널?       유형            
------- -------- ------------- 
P_NO    NOT NULL NUMBER(10)    
P_NAME           VARCHAR2(50)  
P_IMAGE          VARCHAR2(50)  
P_PRICE          NUMBER(10)    
P_DESC           VARCHAR2(200) 
CT_NO            NUMBER(10)    
*/
public class Pproduct {

	private int p_no; 
	private String p_name; 
	private String p_image; 
	private int p_price; 
	private String p_desc; 
	
	//FK
	private int ct_no;
	
	public Pproduct() {
		// TODO Auto-generated constructor stub
	}

	public Pproduct(int p_no, String p_name, String p_image, int p_price, String p_desc, int ct_no) {
		super();
		this.p_no = p_no;
		this.p_name = p_name;
		this.p_image = p_image;
		this.p_price = p_price;
		this.p_desc = p_desc;
		this.ct_no = ct_no;
	}

	public int getP_no() {
		return p_no;
	}

	public String getP_name() {
		return p_name;
	}

	public String getP_image() {
		return p_image;
	}

	public int getP_price() {
		return p_price;
	}

	public String getP_desc() {
		return p_desc;
	}

	public int getCt_no() {
		return ct_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}

	public void setCt_no(int ct_no) {
		this.ct_no = ct_no;
	}

	@Override
	public String toString() {
		return "Product [p_no=" + p_no + ", p_name=" + p_name + ", p_image=" + p_image + ", p_price=" + p_price
				+ ", p_desc=" + p_desc + ", ct_no=" + ct_no + "]";
	}
}
