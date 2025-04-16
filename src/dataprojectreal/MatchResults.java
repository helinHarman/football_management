package dataprojectreal;
public class MatchResults {
    public MatchSim match;
    public MatchProcess process;
    
    Object[] results;
    int top;
    
    public MatchResults(int size){
        results = new Object[size];
        top = -1;
    }
    public void push(String result){
         top++;
         results[top] = result;
    }    
    public void pop(){
        top--;
    }
    public void printStack(){
        
        for(int i = top; i > -1; i--){
          System.out.println(results[i]);
        }
    }
    public MatchSim getMatch() {
        return match;
    }

    public void setMatch(MatchSim match) {
        this.match = match;
    }

    public MatchProcess getProcess() {
        return process;
    }

    public void setProcess(MatchProcess process) {
        this.process = process;
    }

    public Object[] getResults() {
        return results;
    }

    public void setResults(Object[] results) {
        this.results = results;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
    
    
    
    
    
    
    
    
    
    
}
