
public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeUpperLowerPrintSharedObject shredObject = new SynchronizeUpperLowerPrintSharedObject();
		SynchronizeUpperThread upperThread = new SynchronizeUpperThread(shredObject);
		SynchronizeLowerThread lowerThread = new SynchronizeLowerThread(shredObject);
		upperThread.start();
		lowerThread.start();

	}

}
