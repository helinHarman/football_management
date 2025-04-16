package dataprojectreal;
public class Player {
    public String playerName;
    public int playerID;
    public String position;
    public int goalScored;
    public PlayerList playerList;

    public Player(String playerName, int playerID, String position, int goalScored) {
        this.playerName = playerName;
        this.playerID = playerID;
        this.position = position;
        this.goalScored = goalScored;
    }
    public void updateProfile(int goalScored){
        this.goalScored=goalScored;
        
    }
    public void addPlayer(Player player){
      playerList.addPlayerToList(player);
    }
    
    public void print(){
        System.out.println(playerName.toUpperCase()+" PROFILE");
        System.out.println("Name : "+playerName);
        System.out.println("ID : "+playerID);
        System.out.println("Position : "+position);
        System.out.println("Goals : "+goalScored);
    }
    
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
    }
}
