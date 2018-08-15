
package Sell;

import java.util.Scanner;


public class Restaurant 
{
    private final String name;
    private final long contact;
    private final float OpeningTime;
    private final float ClosingTime;
    private final String[] cuisine;

    public Restaurant(String name, long contact, float OpeningTime, float ClosingTime, String[] cuisine) 
    {
        this.name = name;
        this.contact = contact;
        this.OpeningTime = OpeningTime;
        this.ClosingTime = ClosingTime;
        this.cuisine = cuisine;
    }

    public String getName() 
    {
        return name;
    }

    public long getContact() 
    {
        return contact;
    }

    public float getOpeningTime() 
    {
        return OpeningTime;
    }

    public float getClosingTime() 
    {
        return ClosingTime;
    }

    public String[] getCuisine() 
    {
        return cuisine;
    }

    public int restaurantCount(String[] cuisine, String cuisineName, float openingTime) 
    {
        int count = 0;
        for (String cuisine1 : cuisine) 
        {
            if (cuisine1.trim().startsWith(cuisineName) && openingTime == 7.0) 
            {
                count = 1;
            }
        }
        return count;
    }

    public boolean closingAfterTime(String name, float closingTime) 
    {
        boolean flag = false;
        if (closingTime == 10.0 || closingTime == 22.0) 
        {
            flag = true;
        }
        return flag;
    }

    public int cuisineCount(String[] cuisine) 
    {
        int cuisineCount = 0;
        for (String cuisine1 : cuisine) 
        {
            if (cuisine1.equals("punjabi") || cuisine1.equals("kathiyawadi") || cuisine1.equals("chinese")) 
            {
                cuisineCount = 1;
            }
        }
        return cuisineCount;
    }

    public static void main(String[] args) 
    {
        Scanner get = new Scanner(System.in);

        System.out.println("How many restaurants: ");
        int limit = get.nextInt();
        Restaurant[] rest = new Restaurant[limit];
        String CuisineName = "kathiyawadi";
        int nameCount = 0;
        int cuisineCount = 0;
        boolean closingSatus = false;

        for (int loop = 0; loop < limit; loop++) 
        {
            System.out.println("Restaurant Name: ");
            String name = get.next();

            System.out.println("Restaurant Contact: ");
            long contact = get.nextLong();

            System.out.println("Restaurant Opening-time[ex: 10.00 | 24-hours]: ");
            float openingTime = get.nextFloat();

            System.out.println("Restaurant closing-time[ex: 22.00 | 24-hours]: ");
            float closingTime = get.nextFloat();

            System.out.println("How many cuisine");
            int count = get.nextInt();
            String[] c_name = new String[count];
            for (int c = 0; c < count; c++) 
            {
                System.out.println("Cuisine " + c + " name: ");
                c_name[c] = get.next();
            }
            rest[loop] = new Restaurant(name, contact, openingTime, closingTime, c_name);

            nameCount += rest[loop].restaurantCount(rest[loop].getCuisine(), CuisineName, rest[loop].getOpeningTime());

            cuisineCount += rest[loop].cuisineCount(rest[loop].getCuisine());
        }

        System.out.println("\n" + nameCount + " " + CuisineName
                + " restaurants opens after 7:00 AM");


        System.out.println("\n");
        for (int loop = 0; loop < limit; loop++) 
        {
            closingSatus = rest[loop].closingAfterTime(rest[loop].getName(), rest[loop].getClosingTime());
            {
                if (closingSatus) 
                {
                    System.out.println(rest[loop].getName().toUpperCase() + " closes after 10:00 PM");
                }
            }
        }


        System.out.println("\n" + cuisineCount + " restaurants which serves Kathiyawadi, Punjabi or Chinese");
    }
}