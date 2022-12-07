/*
- 쓰레드객체 만드는 방법(형식)
     
	type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		동사원형:public void run()
	3. Thread 객체를 생성한다. 						-> CreateCustomThreadMain
	4. Thread 객체를 통해서 Thread를 시작시킨다.	-> CreateCustomThreadMain
	*/
public class CreateCustomThread extends Thread{
	@Override
	public void run() {
		while(true) {
		System.out.println("가." + Thread.currentThread().getName() + "쓰레드실행");
		System.out.println("나." + Thread.currentThread().getName() + "쓰레드실행 후 반환");
		}
	/*public void run() {
		System.out.println("가." + Thread.currentThread().getName() + "쓰레드실행");
		System.out.println("나." + Thread.currentThread().getName() + "쓰레드실행 후 반환");
		return;
		*/
	}
}
