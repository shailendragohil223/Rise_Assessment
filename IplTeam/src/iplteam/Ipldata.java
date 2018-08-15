
package IplTeam;

import java.util.Arrays;
import java.util.Scanner;



class Team
{
    private final String T_name;
    private final String ground;
    private final String owner;
    Player [] player;

    public Team(String T_name, String ground, String owner, Player[] player) 
    {
        this.T_name = T_name;
        this.ground = ground;
        this.owner = owner;
        this.player = player;
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

    public Player[] getplayer() {
        return player;
    }

    @Override
    public String toString() {
        return "Team{" + "T_name=" + T_name + ", ground=" + ground + ", owner=" + owner + ", player=" + Arrays.toString(player) + '}';
    }
}
class Player
{
    String player_name;
    String role;
    String country;

    public Player(String player_name, String role, String country) {
        this.player_name = player_name;
        this.role = role;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Player{" + "player_name=" + player_name + ", role=" + role + ", country=" + country + '}';
    }
}
public class Ipldata 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Team [] t = new Team[4];
        Player [] player = new Player[11];
        for(int i=0;i<t.length;i++)
        {
            int count=0,sell=0,add=0,binu=0,nav=0;
            System.out.println("Enter a team name");
            String t_name=sc.next();
            System.out.println("Enter a team ground");
            String ground=sc.next();
            System.out.println("Enter a team owner");
            String owner=sc.next();
            label:
            for(int j=0;j<player.length;j++)
            {
                System.out.println("Enter a player name");
                String p_name=sc.next();
                System.out.println("Enter a player role");
                String role=sc.next();
                if(!role.equalsIgnoreCase("Captain"))
                {
                    sell++;
                    if(sell==11)
                    {
                        System.out.println("Enter atleast one caption");
                        j--;
                        continue;
                    }
                }
                else
                {
                    add++;
                    if(add>1)
                    {
                        System.out.println("There is already one caption");
                        j--;
                        continue;
                    }
                    
                }
                if(!role.equalsIgnoreCase("Wicketkeeper"))
                {
                    binu++;
                    if(binu==11)
                    {
                        System.out.println("Enter atleast one wicketkeeper");
                        j--;
                        continue;
                    }
                }
                else
                {
                    nav++;
                    if(nav>1)
                    {
                       System.out.println("There is already one wicketkeeper");
                       j--;
                       continue; 
                    }
                }
                System.out.println("Enter a player country");
                String country=sc.next();
                
                if(!country.equalsIgnoreCase("india"))
                {
                    count++;
                    if(count>4)
                    {
                        System.out.println("Please enter indian player");
                        j--;
                        continue;
                    }
                }
                
                player[j]=new Player(p_name, role,country);
            }
            t[i]=new Team(t_name, ground, owner, player);
        }
    }  
}
