package akshay;

public class Reverse_int 
{
	public static void main(String[] args) 
	{
	
		int Org = 123;   //54321
	    int Rev  =0; 
	    
	    for(int i=Org; i>0; i=i/10 ) 
	    {   
	    	int rem= i%10;
	    	Rev=Rev*10 + rem; 
	    }
	    System.out.println(Rev);


	}
}
