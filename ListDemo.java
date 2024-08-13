mport java.util.ArrayList;
import java.util.Iterator;

public class   ListDemo {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    // Basic Iteration over a Collection using ArrayList and Iterator
	    ArrayList <Object>al = new ArrayList(); 
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    ListDemo ld = new ListDemo();
	    ld.calculate(al);
	    

	  }

	  private void calculate(ArrayList al) {
	    // TODO Auto-generated method stub
	    int total = 0; 
	    Iterator<Object> it = al.iterator();
	    while(it.hasNext())
	    {
	      total = total + (int)it.next();
	    }
	    System.out.println(total);
	  }

	}
