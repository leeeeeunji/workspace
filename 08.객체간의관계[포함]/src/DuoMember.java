
public class DuoMember {
	private int no;//회원 번호
	private String name;//회원 이름
	public DuoMember() {
	}
	public DuoMember(int no, String name) {
		super();//생략가능
		this.no = no;
		this.name = name;
	}
	
	/*
	 * getter, settet 메소드 생성 단축키
	 * alt + shift + s -> r
	 */
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(no + "\t" + name);
	}
	

}
