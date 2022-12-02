public abstract class Employee {
    private int no;
    private String name;
    private int pay;
    
    
    public Employee() {
		
	}
    
    public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}


    /*
     급여계산메소드 calculatePay
     	- 실제 구현작업 불가능(abstract니까)
     	- 자식클래스에서 !반드시! 재정의(구현)해야하는 메소드
     	- 재정의 강제(규칙, specification)
     */
    public abstract void calculatePay();

    public void print(){
    	System.out.println(this.no + "\t" + this.name + "\t" + this.pay + "\t");
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

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
