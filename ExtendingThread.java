 //Define a class that extends Threads
public class ExtendingThread extends Thread {
	@Override
public void run() {
		// Step 3: Loop 5 times, simulating work
	for(int i=0; i<5;i++)
	{
		System.out.println("Thread running:" + i);
		try {
            // Step 4: Sleep for 500 milliseconds to simulate a delay
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{  // Step 5: Handle any interruption during sleep
			Thread.currentThread().interrupt();
		}
		
	}
	
}

}

// mainThread

public class Main {

	public static void main(String[] args) {
//Step 6: This does not start the thread yet; it only creates the thread object.
		ExtendingThread thread = new ExtendingThread();
		  // Step 7: Start the thread
		thread.start();
        // Step 8: Main thread continues running
		System.out.println("Main thread running  ");
	}
	}


/*
 

        The start() method is called on the MyThread object. This triggers the Java Virtual Machine (JVM) to create a new thread of execution, which then calls the run() method on the MyThread object.

    Step 8: Main thread continues running
        After starting the MyThread thread, the main() method continues to execute. The main thread prints "Main thread running" and completes its execution, potentially before or after MyThread finishes.

3. Understanding Concurrent Execution

    When thread.start() is called, the run() method of MyThread is executed in a separate thread. This thread runs concurrently with the main thread.
    The main thread does not wait for the new thread to finish; it continues its own execution. This is why you might see the output "Main thread running" before or after the first "Thread running: 0".

*/
