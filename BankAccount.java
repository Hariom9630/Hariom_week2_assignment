import java.util.*;
class BankAccount
{   
   static int y=1000;
   
   Scanner sc=new Scanner(System.in);
	void desposit()
	{
		System.out.println("Enter Ammount");
		int x=sc.nextInt();
		System.out.println("Ammount deposited="+x);
		System.out.println("total amount is="+(y=x+y));
	}
	
	void Withdrawal()	
	{   
	if(y==0&&y<0)
		{
			System.out.println("low amount cant proceed withdrawal");
		     return;
		}
		else
		{
		System.out.println("Enter Amount for Withdrawal");
		int z=sc.nextInt();
		System.out.println("transaction successful");
		System.out.println("remaining balance is="+(y=y-z));
	}
	}
	void checkbalance()
	{
		System.out.println("total amount is="+y);
	}
	public static void main(String ar[])
	{ int m;
		 BankAccount b=new BankAccount();
		do
		{
		System.out.println("1.for deposited");		
		System.out.println("2.for withdrawal");		
		System.out.println("3.for checkbalance");	
       
	   Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your choice");
	    m=sc.nextInt();
        switch(m)
		{
			case 1:
			b.desposit();
			break;
			
			case 2:
			b.Withdrawal();
			break;
			
			case 3:
			b.checkbalance();
			break;
		}	
		}
while(m<=4&&m>0)	;	
	}
}
	