package risebank;

import java.util.Scanner;

class RiseB
{
    String Name;
    String Gender;
    double i_balance;

    public RiseB(String Name, String Gender) {
        this.Name = Name;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }
    
}
public class RiseBank 
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
    System.out.println("Enter your name & gender(Male/Female)::");
    String Name=sc.nextLine();
    String Gender=sc.nextLine();
    if(Gender.equalsIgnoreCase("Male"))
    {
        System.out.println("Thank you Mr."+Name);
    }
    else
    {
        System.out.println("Thank you Mrs."+Name);
    }
 
     System.out.println("Enter your inital balance::");
     double i_balance=sc.nextDouble();
     int choice;
     boolean quit=false;
  
        
        
       do
      
       {
        System.out.println(":::Please Choose Number The Following Operations:::");
        System.out.println("1. For Withdraw");
        System.out.println("2. For Deposit");
        System.out.println("3. For Balance Inquery");
        System.out.println("4. For Change Name");
        System.out.println("5. Exit");
        choice =sc.nextInt();
        
           
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter amount to withraw:");
                double w = sc.nextDouble();
                i_balance=i_balance-w;
                System.out.println("Your current inital balance is :"+i_balance);
                quit=true;
                break;             
            }
            
            case 2:
            {
                System.out.println("Enter amount to Deposit:");
                double d = sc.nextDouble();
                i_balance=i_balance+d;
                System.out.println("Your current inital balance is :"+i_balance);
                quit=true;
                break;             
            }
            
            case 3:
            {
                
                System.out.println("Your current inital balance is :"+i_balance);
                quit=true;
                break;             
            }
            
            case 4:
            {
                System.out.println("old name ::"+Name);
                System.out.println("new name ::");
                String nName = sc.next();
                Name=nName;
                System.out.println("Updated name ::"+Name);
                quit=true;
                break;
            }
            case 5:
            {
                System.out.println("Thank you for visiting here...........");
                quit=false;
                break;
            }
            
            
            default:
            {
                System.out.println("Wrong input select b/w 1 to 5.....");
                quit=true;
                break;
            }
            
            
            
            
        }
       }   
       while(quit!=false);
       System.out.println("Good Bye ....");
               }
}
       
    

 