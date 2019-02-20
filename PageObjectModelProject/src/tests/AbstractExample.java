package tests;
abstract class Myprinter
{  
    abstract void print();  
} 
public class AbstractExample
{
	public static void main(String[] args) 
	{		  
		Myprinter d=new Myprinter(){  
	            public void print()
	            {
	            	System.out.println("I m printing");
	            }  
	        };  
	        d.print();  
	}

}
