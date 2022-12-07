
public class ControlStopThread1 extends Thread {
	@Override
	public void run() {
		try {
			for(int i = 1; i < 100 ; i++) {
				System.out.println("downloading....[" + i + "%]");
				Thread.sleep(10);
			}
			
		}catch (Exception e) {
			
		}
		System.out.println("ControlStopThread1 : thread가 JVN return thread end ");
		return;
	}
}
