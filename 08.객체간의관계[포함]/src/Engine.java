
public class Engine {
	public String type;//엔진 타입
	public int cc;//엔진 배기량
	public Engine() {
		
	}
	public Engine(String type, int cc) {
		super();
		this.type = type;
		this.cc = cc;
	}
	
	public void print() {
		System.out.println(this.type + "\t" + this.cc);
	}
	
	public String getType() {
		return type;
	}
	public int getCc() {
		return cc;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
