public class  SumAndAverage {
	public static void main(String[] args) {
		 
		   
		    int [] number  = {1,2,3,4,5};
		  int sum=0;
		    for (int num:number)
		    {
		    	  sum +=num; 
		    	   //   double Avg =sum/number.length;
		    	     
		    }
		    double Avg =sum/number.length;
		    System.out.println("sum"+sum);
		    System.out.println("Aveerage"+Avg);
		}	}


