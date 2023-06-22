package akshay;

public class Palindrome 
{

  public static void main(String[] args) 
  {
	String Org= "MAM";
	String Rev="";
	
	for(int i=Org.length()-1; i>=0; i--) 
	{
       Rev=Rev+Org.charAt(i);

	}
	if(Org.equals(Rev)) 
	{
		System.out.println("Given String is a Palindrome");
	}
	else 
	{
		System.out.println("Given String is not a Palindrome");
	}
		
 }
}
