
    	public class FindDuplicates {
    	    public static void main(String[] args) {
    	    	
    	        int [] numbers  = {1, 2, 3, 4, 2, 5, 3, 6, 7};
    	        for (int i=0;i<numbers.length;i++)
    	        {
    	        	for(int j=i+1;j<numbers.length;j++)
    	        	{
    	        		if (numbers[i]==numbers[j])
    	        		{
    	        			System.out.println("Duplicate"+numbers[i]);
    	        		}
    	        	}
    	        }
    	       
    	}
    	}



