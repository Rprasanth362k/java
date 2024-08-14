public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadChild tc1 = new ThreadChild(); 
        System.out.println("After Creation " + Thread.currentThread().getState());
        //tc1.run();
        tc1.start();
    System.out.println("After start() "+Thread.currentThread().getState());
        
        ThreadChild tc2 = new ThreadChild(); 
        //tc1.run();
        tc2.start();
        System.out.println("Name: "+tc2.currentThread().getName());
        System.out.println("priority: "+tc2.currentThread().getPriority());
             
        
        try {
              tc2.setPriority(0);  // This will throw IllegalArgumentException
          } catch (IllegalArgumentException e) {
              System.out.println("Exception caught: " + e.getMessage());
          }
        
        
        for(int i=1; i<=5; i++)
        {
          System.out.println("Thread Demo");
        }
        System.out.println("After all "+Thread.currentThread().getState());
    }

  }


//

public class ThreadChild extends Thread {

		// TODO Auto-generated method stub
		 public void run()
		  {
		    for(int i=1; i<=5; i++)
		    {try {
		    	Thread.sleep(3000);
		      System.out.println("Thread Child");
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Handled exception");
		    	
		    }
		    }
		    
		  }

		

	}

