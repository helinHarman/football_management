package dataprojectreal;
public class Team {
    public String teamName;
    public int teamID;
    public int totalPoint;
    public int goal;
    public PlayerList playerList;
    public int goalDifference;
    public HashTableTeam htt;

    public Team(String teamName, int teamID, int totalPoint, 
            int goal, PlayerList playerList,int goalDifference) {
        this.teamName = teamName;
        this.teamID = teamID;
        this.totalPoint = totalPoint;
        this.goal = goal;
        this.playerList = playerList;
        goalDifference=0;
    }

    public void addTeamToHash(Team team){
        htt.putLinear(team);
    }
            
    public void updateTeam(int goal,int goalDifference){
        this.goalDifference=goalDifference;
        this.goal=goal;
        
    }
    public void deleteTeam(Team team){
        htt.deleteTeam(team);
    }
    
    public void printTeam(){
        System.out.println(teamName.toUpperCase());
        System.out.println("Name : "+teamName);
        System.out.println("ID : "+teamID);
        System.out.println("Total Point : "+totalPoint);
        System.out.println("Goal : "+goal);
        System.out.println("Goal Difference : "+goalDifference);
        System.out.println("---------------");
        System.out.println("Players of "+teamName);
        playerList.printPlayerList();
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }
    
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public PlayerList getPlayerList() {
        return playerList;
    }

    public void setPlayerList(PlayerList playerList) {
        this.playerList = playerList;
    }
    
}
