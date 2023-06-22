package akshay;

public class ReversString1 
{
	public static void main(String[] args) 
	{
		String Org = "Akshay Bhange";
		for(int i=Org.length()-1; i>=0; i--) 
		{
			char Rev = Org.charAt(i);
			System.out.print(Rev);
		}
		
	}

}
