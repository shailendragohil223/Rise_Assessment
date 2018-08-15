package IPLDemo;

import java.util.Scanner;

class IPL
{

    static class Player {

        private final String name;
        private final String role;
        private final String country;

        public Player(String name, String role, String country) {
            this.name = name;
            this.role = role;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }

        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return "Player{" + "name=" + name + ", role=" + role + ", country=" + country + '}';
        }
    }

    private final String teamName;
    private final String homeGroundName;
    private final String teamOwner;

    public IPL(String teamName, String homeGroundName, String teamOwner,
            int playerCount, String playerName, String playerRole, String playerCountry) {
        this.teamName = teamName;
        this.homeGroundName = homeGroundName;
        this.teamOwner = teamOwner;
        IPL.Player[] p = new IPL.Player[playerCount];
        for (int loop = 0; loop < playerCount; loop++) {
            p[loop] = new Player(playerName, playerRole, playerCountry);
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public String getHomeGroundName() {
        return homeGroundName;
    }

    public String getTeamOwner() {
        return teamOwner;
    }

    @Override
    public String toString() {
        return "IPL{" + "teamName=" + teamName + ", homeGroundName=" + homeGroundName + ", teamOwner=" + teamOwner + '}';

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Teams? ");
        int limit = scanner.nextInt();

        System.out.println("How Many Players: ");
        int playerCount = scanner.nextInt();

        IPL[] ipl = new IPL[limit];
        IPL.Player[] player = new IPL.Player[playerCount];

        for (int loop = 0; loop < limit; loop++) {
            System.out.println("Enter team name: ");
            String teamName = scanner.next();

            System.out.println("Enter team home-ground: ");
            String teamHomeGround = scanner.next();

            System.out.println("Enter team-owner: ");
            String teamOwner = scanner.next();
            
            boolean captainFlag = false;
            boolean wicketKeeperFlag = false;
            int awayPlayersCount = 0;
            
            for (int loop2 = 0; loop2 < playerCount; loop2++) {
                
                System.out.println("[Away player count: "+ awayPlayersCount 
                        + ", Captain Available: " + captainFlag 
                        + ", Wicket-keeper Available: "+ wicketKeeperFlag + "]");

                System.out.println("Enter " + (loop2 + 1) + " Name: ");
                String playerName = scanner.next();

                System.out.println("Enter " + playerName + " Role: ");
                String playerRole = scanner.next();

                System.out.println("Enter " + playerName + " Country: ");
                String playerCountry = scanner.next();
                
                if(!playerCountry.equalsIgnoreCase(teamHomeGround)){
                    awayPlayersCount++;
                }
                
                if(awayPlayersCount < 4 && (loop2 < playerCount - 4)){
                    System.out.println("");
                }

                ipl[loop] = new IPL(teamName, teamHomeGround, teamOwner, playerCount, playerName, playerRole, playerCountry);
            }
        }

        for (int i = 0; i < limit; i++) {
            System.out.println(ipl[i]);
            for (int loop = 0; loop < playerCount; loop++) {
                System.out.println(player[playerCount]);
            }
        }
    }

    }