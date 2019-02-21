package tests;

class InnerclassExample
{  
	 private int id=30;  
	 class Inner
	 {  
	  void msg()
	  {
		  System.out.println("My id is "+id);
		  }  
	 }  
	 public static void main(String args[])
	 {  
		 InnerclassExample obj=new InnerclassExample();  
		 InnerclassExample.Inner inner=obj.new Inner();  
	     inner.msg();  
	 }  
	}
