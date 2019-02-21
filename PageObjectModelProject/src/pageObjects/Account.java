package pageObjects;

public class Account
{	
	String id;
	String name;
	final int roi=9;
	int balance=0;	
	Account(String id,String name)
	{
	this.id=id;
	this.name=name;
	}
	
	Account(String id,String name,int balance)
	{;
		this.id=id;
		this.name=name;
		this.balance=balance;	
	}
	String getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	String getBalance()
	{
		return "Your Balance amount is: " + balance;
	}
	int credit(int amount)
	{
		balance=balance+amount;
		return balance;
	}
	int debit(int amount)
	{
		if(amount <= balance)
		{
			balance = balance-amount;
		}
		else
		{
			System.out.println("Amount excceeded balance");
		}
		return balance;
	}
	int transferTo(Account account,int amount)
	{
		if(amount <= balance)
		{
			balance=balance-amount;
			System.out.println("Transfered amount to the given account");
			account.credit(amount);
		}
		else
		{
			System.out.println("Amount excceeded balance");
		}
		return balance;	
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(balance);
	}	
	public String toString()
	{
		return id+" "+name+" "+balance;
	}

	public static void main(String[] args) 
	{
	Account rahul =new Account("rahul123","Rahul Kumar");
	rahul.display();
	Account smitha =new Account("smith123","smitha",100000);
	smitha.display();
	
	System.out.println(rahul.credit(1000));
	rahul.display();
	
	rahul.debit(500);
	rahul.display();
	
	System.out.println(rahul.debit(200));
	
	System.out.println(rahul.getBalance());
	smitha.transferTo(rahul, 30000);	
	System.out.println(smitha.getBalance());
	System.out.println(rahul.getBalance());

	
	
			
		
	
		
		
		
		
		
		
		

	}

}
