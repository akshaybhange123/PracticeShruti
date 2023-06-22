package akshay;

public class This extends Super_1{
int a=20;

String k="Koli";

public void m1() 
{
   int a=30; 
   
    System.out.println(a);
	System.out.println(this.a);
	System.out.println(this.k);
    System.out.println(super.b);
	
}
public static void main(String[] args)
{
	This A = new This();
	     A.m1();
	     
	    
	   
	
}

}
