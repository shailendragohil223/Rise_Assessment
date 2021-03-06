class Customer
{  
	int amount=10000;  
  
	synchronized void withdraw(int amount)
	{  
		System.out.println("going to withdraw...");  
  
		if(this.amount<amount)
		{  
			System.out.println("Less balance; waiting for deposit...");  
			try{wait();}catch(InterruptedException e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed...");  
	}  
  
	synchronized void deposit(int amount)
	{  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... ");  
		notify();  
	}  
}  
  
public class Test
{  
	public static void main(String args[])
	{  
		final Customer c=new Customer();  
		new Thread()
		{  
                        @Override
			public void run(){c.withdraw(15000);}  
		}.start();  
		new Thread()
		{  
                        @Override
			public void run(){c.deposit(10000);}  
		}.start();  
  	}
}  
class Runnable1 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<11;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}