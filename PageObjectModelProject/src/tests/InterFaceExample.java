package tests;
interface Printer
{  
    public void print();  
} 
public class InterFaceExample
{
	public static void main(String[] args) 
	{		  
		 Printer d=new Printer(){  
	            public void print()
	            {
	            	System.out.println("I m printing");
	            }  
	        };  
	        d.print();  
	}

}
 
