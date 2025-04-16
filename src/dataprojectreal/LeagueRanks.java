package dataprojectreal;
public class LeagueRanks {
     Team[] teams;
    int size;

    public LeagueRanks(int maxTeams) {
        teams = new Team[maxTeams];
        size = 0;
    }

    public void addTeamToRanking(Team team) {
        teams[size] = team;
        size++;
        moveUp(size - 1);
    }
    public void printStandings() {
    System.out.println("League Standings:");
    for (int i = 0; i < size; i++) {
        System.out.println((i + 1) + ". " + teams[i].getTeamName() +
                " - P: " + teams[i].getTotalPoint()+" GD: "+
                teams[i].getGoalDifference());
    }
      }
    private void moveUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (teams[index].getTotalPoint()> 
                    teams[parentIndex].getTotalPoint()) {
                Team temp = teams[index];
                teams[index] = teams[parentIndex];
                teams[parentIndex] = temp;
                index = parentIndex;
            } else {
                break;
            }
        }
    }



    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
    
