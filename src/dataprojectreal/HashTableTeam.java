package dataprojectreal;
public class HashTableTeam {
    Team team;
    
    Team[] table;
    int prime;
    int size;
    
    public HashTableTeam(int capacity){
        prime = 17;
        table = new Team[capacity];
        
        for(int i = 0; i < capacity; i++){
            table[i] = null;
        }
        
        size = 0;
    }
    
    public void deleteTeam(Team team){
        int index=0;
        while(team.teamName!= table[index].teamName){
            index++;
        }
        if(team.teamName==table[index].teamName){
        table[index].teamName=null;
     
        }
        
    }
    
    
    public void putLinear(Team team){
        int index = hash(team.teamID);
        int originalIndex = index;
        
        while(table[index] != null){
            if(table[index].teamID == team.teamID){
                System.out.println("Player already exists: " + team);
                return;
            }
            index = (index + 1) % table.length;
            if(index == originalIndex){
                System.out.println("Hash table is full");
                return;
            }
        }
        
        table[index] = team;
        size++;
    }
 
    
    public int hash(int key){
        return key % table.length;
    }
    
    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + ": " + (table[i] != null ? table[i].teamName : "null"));
        }
    }

    public Team[] getTable() {
        return table;
    }

    public void setTable(Team[] table) {
        this.table = table;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
