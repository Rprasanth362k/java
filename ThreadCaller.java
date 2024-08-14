public class ThreadCaller {

	public static void main(String[] args) {
		Greetings gg = new Greetings(); 
		Thread_Child tc1 = new Thread_Child(gg, "To Java");
		Thread_Child tc2 = new Thread_Child(gg, "Prasanth");
		tc1.start();
		tc2.start();
	}

}


--------------------------
public class Thread_Child extends Thread {
	
	Greetings g;  // greeting class reference  g
	  String name; 
	  
	  public Thread_Child(Greetings g, String name) // overloaded constructor
	  {
	    this.g = g;
	    this.name = name; 
	  }
	  
	  public void run()
	  {
	    g.greet(name);
	  }
	
	
	
	

}

---------------------------
public class Greetings {
	public synchronized void greet(String name)
	  {
		for(int i=1; i<=5; i++)
	    {
	      System.out.print("Welcome ");
	      try {
	        Thread.sleep(2000);
	        System.out.println(name);
	      } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	      
	    }}}
