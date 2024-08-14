public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubThread st1 = new SubThread();
	    st1.start();// New to Runnable 
	    //st1.start();// Runnable (if start aganie thread it comes error because alrady thread started and stand in runnable state again how cau start)
	  // Thread.yield();
	    for(int i=1; i<=5; i++)
	    {
	      System.out.println("Sub Thread");
	   }
	}

}
/*
 Thread.yield() is used to hint the scheduler that the current thread is willing to yield its current use of the CPU, 
 allowing other threads of the same or higher priority to execute.
yield = car a  ,car b driving equla level , car b givingup(விட்டுக்கொடுத்தல்) to car a driving

*/

-----------------------------------
public class SubThread  extends Thread  {
	 public void run()
	  {
	    for(int i=1; i<=5; i++)
	    {
	      System.out.println("Sub Thread");
	    }
	  }
	}
