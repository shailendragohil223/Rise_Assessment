
import java.util.ArrayList;
import java.util.Scanner;

class ShoppingItem
{

private String ItemName;
    private double ItemPrice;
    private int ItemQty;

public ShoppingItem()
{
        ItemName = "Fruit";
        ItemPrice = 100;
        ItemQty = 1;

}

    public ShoppingItem(String ItemName, double ItemPrice, int ItemQty )
{
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemQty = ItemQty;

}


public String getItemName() {
    return ItemName;
}

public double getItemPrice() {
    return ItemPrice;
}

public double getItemTotalPrice() {
    return ItemPrice * ItemQty;
}

public int getItemQty() {
    return ItemQty;
}

public void setItemName(String ItemName)
{
    this.ItemName = ItemName;
}

    public void setItempPrice(double ItemPrice)
{
    this.ItemPrice = ItemPrice;
}

    public void setItemQty(int ItemQty)
{
    this.ItemQty = ItemQty;
}


    @Override
public String toString()
{
    String state = ItemName + " -  Rs." + ItemPrice + " x " + ItemQty;
    return state;
}
}


class ShoppingList
{

    ArrayList<ShoppingItem> list = new ArrayList<>();

         public void addItem()
    { 
            System.out.println();
            System.out.println("enter in the name of your item");
            Scanner keyboard = new Scanner(System.in);
            String ItemName = keyboard.nextLine();

            System.out.println("enter in the price of your item");
            double ItemPrice = keyboard.nextDouble();

            System.out.println("enter in the Qty of your item");
            int ItemQty = keyboard.nextInt();

            ShoppingItem Item = new ShoppingItem(ItemName, ItemPrice,
                        ItemQty);
            list.add(Item);
            System.out.println("Item Added");
    }

    //Display list and total number of items. 
         public void displayItem(){
             System.out.println( list.size()+ " items. ");
             list.forEach((x) -> {
                 System.out.println(x.toString());
        });

                 }



 }

public class Store
{

    public static void main( String [] args) { 
        Scanner input = new Scanner(System.in);
        ShoppingList myList = new ShoppingList();
        int userOpt = 0;
        while (userOpt != 3) {
            System.out.println("");
            System.out.println("----- Shopping List------");
            System.out.println("(1) Add an item to the list. ");
            System.out.println("(2) Display list and total number of items. ");
            System.out.println("(3) Exit. ");
            userOpt = input.nextInt();  

            if (userOpt == 1) {
            myList.addItem();

            }

            if (userOpt == 2) {
            myList.displayItem();
            }
        }
    }
}