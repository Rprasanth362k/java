public class MinMaxInArray {
    public static void main(String[] args) {
      int [] numbers = {3,5,7,9,11,-1,2,4,5,6,8,10,12};
      int min = numbers[0];
      int max  =numbers[0];
      for (int num:numbers)
      {
    	  if (num<min)
    	  {
    		 min =num;
    	  }
    	  if (num>max)
    	  {
    		  max=num;
    	  }
      }System.out.println("min"+min);
      System.out.println("max"+max);
    }
}

