package playerdemo;

import java.util.Scanner;

class Player
{
    private String name;
    private String country;
    private String role;

    public Player(String name, String country, String role) {
        this.name = name;
        this.country = country;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", country=" + country + ", role=" + role + '}';
    }
   
    
}
public class PlayerDemo {

    
    public static void main(String[] args)
    {
    
        Player [] players = new Player[3];
        Scanner sc = new Scanner(System.in);
        int count  = 0;
        for(int i=0;i<players.length;i++)
        {
            System.out.println("Enter player "+(i+1)+" name");
            String name = sc.next();
            System.out.println("Enter player "+(i+1)+" country");
            String country = sc.next();
            System.out.println("Enter player "+(i+1)+" role");
            String role = sc.next();
            
            players[i] = new Player(name, country, role);
            
            
        }
        
        for(int i=0;i<players.length;i++)
        {
            if(players[i].getCountry().equalsIgnoreCase("India"))
            {
                count ++;
            }
            
            if(players[i].getName().startsWith("S"))
            {
                System.out.println(players[i]);
            }
        }
        System.out.println("There are "+count+" players form India");
        
        
        
        
    }
    
}
