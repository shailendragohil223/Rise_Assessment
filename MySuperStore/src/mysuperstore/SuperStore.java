
package mysuperstore;

import java.util.Scanner;

class Store
{
    private final String Name;
    private final String Code;
    private final double Price;
    int nextDouble;

    public Store(String Name, String Code, double Price) {
        this.Name = Name;
        this.Code = Code;
        this.Price = Price;
    }

  
 
    public String getName() {
        return Name;
    }

    public String getCode() {
        return Code;
    }

    public double getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Store{" + "Name=" + Name + ", Code=" + Code + ", Price=" + Price + '}';
    }
    
    

}
public class SuperStore 
{


    public static void main(String[] args) 
    {
        int choice;
        boolean quit=false;
        Scanner sc = new Scanner(System.in);
        System.out.println(":::WELCOME TO MY SUPER STORE:::");
        String ABC123 = null;
        String i1;
        i1 = ABC123;
        String i2;
        String ANC173 = null;
        i2=ANC173;
        String i3;
        String QWE873 = null;
        i3=QWE873;
        String i4;
        String XYZ123 = null;
        i4=XYZ123;
        String i5;
        String XYZ789 = null;
        i5=XYZ789;
        
        
       do
      
       {
        System.out.println("Select your choice:");
        System.out.println("1. List of Items");
        System.out.println("2. Make Purchases");
        System.out.println("3. Remove items");
        System.out.println("4. Show Bill");
        System.out.println("5. Exit");
        choice = sc.nextInt();
        
        
                
        
           
        switch(choice)
        {
            case 1:
            {
                System.out.println("List of Items:");
                System.out.println("\n Item: Bag      Code:ABC123    Price:450 ");
                System.out.println("\n Item: Shoes    Code:ANC173    Price:1500 ");
                System.out.println("\n Item: Laptop   Code:QWE873    Price:35000 ");
                System.out.println("\n Item: Paint    Code:XYZ123    Price:458 ");
                System.out.println("\n Item: Shirt    Code:XYZ789    Price:500 ");
                quit=true;
                break;             
            }
            
            case 2:
            {
                System.out.println("Purchases:");
                System.out.println("\n Enter The Code Of Item you wantto purchases: ");
                String Code = sc.nextLine();
                quit=true;
                    if(Code.equalsIgnoreCase(i1))
                    {
                        System.out.println("hiii...");
                    }
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
    
}
