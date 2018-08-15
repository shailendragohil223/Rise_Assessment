
package ipldata;

import java.util.Arrays;
import java.util.Scanner;



class Team
{
    private final String T_name;
    private final String ground;
    private final String owner;
    Player [] p;

    public Team(String T_name, String ground, String owner, Player[] p) 
    {
        this.T_name = T_name;
        this.ground = ground;
        this.owner = owner;
        this.p = p;
    }

    public String getT_name() {
        return T_name;
    }

    public String getGround() {
        return ground;
    }

    public String getOwner() {
        return owner;
    }

    public Player[] getP() {
        return p;
    }

    @Override
    public String toString() {
        return "Team{" + "T_name=" + T_name + ", ground=" + ground + ", owner=" + owner + ", p=" + Arrays.toString(p) + '}';
    }
}
class Player
{
    String p_name;
    String role;
    String country;

    public Player(String p_name, String role, String country) {
        this.p_name = p_name;
        this.role = role;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Player{" + "p_name=" + p_name + ", role=" + role + ", country=" + country + '}';
    }
}
public class Ipldata 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Team [] t = new Team[2];
        Player [] p = new Player[4];
        int i,j;
        for(j=0;j<p.length;j++)
        {
            int count=0;
            int c=0;
            int c1=0;
            int d=0;
            int d1=0;
            System.out.println("enter a team name");
            String t_name=sc.next();
            System.out.println("enter a team ground");
            String ground=sc.next();
            System.out.println("enter a team owner");
            String owner=sc.next();
            label:
            for(i=0;i<p.length;i++)
            {
                System.out.println("enter a player name");
                String p_name=sc.next();
                System.out.println("enter a player role");
                String role=sc.next();
                if(!role.equalsIgnoreCase("Captain"))
                {
                    c++;
                    if(c==4)
                    {
                        System.out.println("enter atleast one caption");
                        i--;
                        continue;
                    }
                }
                else
                {
                    c1++;
                    if(c1>1)
                    {
                        System.out.println("there is already one caption");
                        i--;
                        continue;
                    }
                    
                }
                if(!role.equalsIgnoreCase("wicketkeeper"))
                {
                    d++;
                    if(d1==4)
                    {
                        System.out.println("enter atleast one caption");
                        i--;
                        continue;
                    }
                }
                else
                {
                    d1++;
                    if(d1>1)
                    {
                       System.out.println("there is already one wicketkeeper");
                       i--;
                       continue; 
                    }
                }
                System.out.println("enter a player country");
                String country=sc.next();
                
                if(!country.equalsIgnoreCase("india"))
                {
                    count++;
                    if(count>2)
                    {
                        System.out.println("please enter indian player");
                        i--;
                        continue;
                    }
                }
                
                p[i]=new Player(p_name, role,country);
            }
            t[j]=new Team(t_name, ground, owner, p);
        }
    }  
}
