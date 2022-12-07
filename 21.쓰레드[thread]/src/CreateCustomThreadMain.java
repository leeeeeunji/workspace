/*
- 쓰레드객체 만드는 방법(형식)
     
	type A:
	1. Thread 클래스를 상속받는다.					-> CreateCustomThread
	2. Thread class의 run method를 overriding 한다. -> CreateCustomThread
		동사원형:public void run()
	3. Thread 객체를 생성한다.
	4. Thread 객체를 통해서 Thread를 시작시킨다.
	*/
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		//3. Thread 객체를 생성한다.
		//4. Thread 객체를 통해서 Thread를 시작시킨다.
		System.out.println("1. main thread strat");
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("사용자정의 쓰레드 ");
		System.out.println("2. main thread CreateCustomThread 객체.star()메소드 호출 전");
		/*
		<<Thread>>
		public void start() 
			- Causes this thread to begin execution; 
			 	the Java Virtual Machine calls the run method of this thread.
			- The result is that two threads are running concurrently: 
				the current thread (which returns from the call to the start method)
				and the other thread (which executes its run method). 

			- It is never legal to start a thread more than once. 
				In particular, a thread may not be restarted once it has completed execution.
		 */
		cct.start();
		System.out.println("3. main thread CreateCustomThread 객체.star()메소드 호출 후");
		while(true) { 
			System.out.println("4. main thread");
		}

	}

}
