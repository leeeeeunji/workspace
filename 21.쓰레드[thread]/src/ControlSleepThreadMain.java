
public class ControlSleepThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1. main");
		System.out.println("2. main 쓰레드 3초간 실행중지(sleep)");
		Thread.sleep(3000);
		System.out.println("3. main 쓰레드 3초 후 깨어나 실행");
		ControlSleepThread cst = new ControlSleepThread();
		cst.start();
		
		
		
		
		System.out.println("9. main return");

	}

}
