public class Imple_RUNNable_Interface implements  Runnable{

	@Override
	public void run() {
		for( int i=0;i<5;i++) {
			System.out.println("Runnable thread running"+i);
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
		Thread.currentThread().interrupt();	
		}
		
	}

}

}

//Main

public class Main {

	public static void main(String[] args) {
		// Create a Runnable object
		Runnable runnable = new Imple_RUNNable_Interface();
        // Create a Thread object with the Runnable task
		Thread thread = new Thread(runnable);
		thread.start();
        // Main thread can do other work here
		System.out.println("main therad running");
	}

}

/*
The Runnable interface allows defining tasks that can be executed by a thread without extending the Thread class.
The Thread class takes a Runnable object and runs it on a separate thread, enabling concurrent execution with the main thread.

*/
