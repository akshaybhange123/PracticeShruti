package akshay;

public class Revers_String 
{
	public static void main(String[] args) 
    {
		String Org ="Akshay";   //yahskA
		String Rev="";
		
		for(int i=Org.length()-1; i>=0; i--) 
		{
		     Rev =Rev +Org.charAt(i);	
		}
		System.out.println(Rev);
		
		
		
	}

}
