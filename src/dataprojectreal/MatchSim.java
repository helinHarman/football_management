package dataprojectreal;
public class MatchSim {
    
    public Team team1;
    public Team team2;
    public String result;
    public int goalDiff1;
    public int goalDiff2;

    public MatchSim(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.result = "";
    }
 
    public String result(String result){
        return result;
    }
    
    public void simulator(){
        int team1score = (int) (Math.random() * 6);
        int team2score = (int) (Math.random() * 6);
        team1.goal = team1score+team1.goal;
        team2.goal = team1score+team2.goal;
        if(team1score > team2score){
            team1.totalPoint=team1.totalPoint+3;
            result = team1.getTeamName()+" "+team1score+
                    "-"+team2score+" "+team2.getTeamName();  
            goalDiff1=team1score-team2score;
            team1.goalDifference = goalDiff1+team1.goalDifference; 
            goalDiff2=team2score-team1score;
            team2.goalDifference = goalDiff2+team2.goalDifference;
        }
        else if(team1score < team2score){
            team2.totalPoint=team2.totalPoint+3;
            result = team1.getTeamName()+" "+team1score+
                    "-"+team2score+" "+team2.getTeamName();   
            goalDiff1=team1score-team2score;
            team1.goalDifference = goalDiff1+team1.goalDifference; 
            goalDiff2=team2score-team1score;
            team2.goalDifference = goalDiff2+team2.goalDifference;
        }
        else{
            team1.totalPoint=team1.totalPoint+1;
            team2.totalPoint=team2.totalPoint+1;
            result = team1.getTeamName()+" "+team1score+
                    "-"+team2score+" "+team2.getTeamName();
            goalDiff1=team1score-team2score;
            team1.goalDifference = goalDiff1+team1.goalDifference; 
            goalDiff2=team2score-team1score;
            team2.goalDifference = goalDiff2+team2.goalDifference;
        }        
    }
    
    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getGoalDiff1() {
        return goalDiff1;
    }

    public void setGoalDiff1(int goalDiff1) {
        this.goalDiff1 = goalDiff1;
    }

    public int getGoalDiff2() {
        return goalDiff2;
    }

    public void setGoalDiff2(int goalDiff2) {
        this.goalDiff2 = goalDiff2;
    }
    
    
    
    
    
}
