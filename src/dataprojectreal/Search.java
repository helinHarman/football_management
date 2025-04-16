package dataprojectreal;

public class Search {
    private Player rootPlayer; 
    private Team rootTeam;     

    public static class Player {
        private final String playerName;
        public Player left, right;

        public Player(String playerName) {
            this.playerName = playerName;
            this.left = this.right = null;
        }
        public String getPlayerName() {
            return playerName;
        }
    }
    public static class Team {
        private final String teamName;
        public Team left, right;

        public Team(String teamName) {
            this.teamName = teamName;
            this.left = this.right = null;
        }
        public String getTeamName() {
            return teamName;
        }
    }

    public void insertPlayer(String playerName) {
        Player newPlayer = new Player(playerName);
        rootPlayer = insertPlayerRecursively(rootPlayer, newPlayer);
    }

    private Player insertPlayerRecursively(Player root, Player newPlayer) {
        if (root == null) {
            return newPlayer;
        }

        if (newPlayer.getPlayerName().compareTo(root.getPlayerName()) < 0) {
            root.left = insertPlayerRecursively(root.left, newPlayer);
        } else if (newPlayer.getPlayerName().compareTo(root.getPlayerName()) > 0) {
            root.right = insertPlayerRecursively(root.right, newPlayer);
        }

        return root;
    }

    public Player findPlayer(String name) {
        System.out.println(name+" found.");
        return findPlayerRecursively(rootPlayer, name);
    }

    private Player findPlayerRecursively(Player root, String name) {
        if (root == null || root.getPlayerName().equals(name)) {
            return root;
        }

        if (name.compareTo(root.getPlayerName()) < 0) {
            return findPlayerRecursively(root.left, name);
        }

        return findPlayerRecursively(root.right, name);
    }

    public void printPlayers() {
        printPlayerInorder(rootPlayer);
    }

    private void printPlayerInorder(Player root) {
        if (root != null) {
            printPlayerInorder(root.left);
            System.out.println(root.getPlayerName());
            printPlayerInorder(root.right);
        }
    }

    public void insertTeam(String teamName) {
        Team newTeam = new Team(teamName);
        rootTeam = insertTeamRecursively(rootTeam, newTeam);
    }
    private Team insertTeamRecursively(Team root, Team newTeam) {
        if (root == null) {
            return newTeam;
        }
        if (newTeam.getTeamName().compareTo(root.getTeamName()) < 0) {
            root.left = insertTeamRecursively(root.left, newTeam);
        } else if (newTeam.getTeamName().compareTo(root.getTeamName()) > 0) {
            root.right = insertTeamRecursively(root.right, newTeam);
        }
        return root;
    }

    public Team findTeam(String name) {
        System.out.println(name+" found.");
        return findTeamRecursively(rootTeam, name);
    }

    private Team findTeamRecursively(Team root, String name) {
        if (root == null || root.getTeamName().equals(name)) {
            return root;
        }

        if (name.compareTo(root.getTeamName()) < 0) {
            return findTeamRecursively(root.left, name);
        }

        return findTeamRecursively(root.right, name);
    }

    public void printTeams() {
        printTeamInorder(rootTeam);
    }

    private void printTeamInorder(Team root) {
        if (root != null) {
            printTeamInorder(root.left);
            System.out.println(root.getTeamName());
            printTeamInorder(root.right);
        }
    }

    public Player getRootPlayer() {
        return rootPlayer;
    }

    public void setRootPlayer(Player rootPlayer) {
        this.rootPlayer = rootPlayer;
    }

    public Team getRootTeam() {
        return rootTeam;
    }

    public void setRootTeam(Team rootTeam) {
        this.rootTeam = rootTeam;
    }

   
    
}

    
    
    
    
    
    
    
    
    
    

