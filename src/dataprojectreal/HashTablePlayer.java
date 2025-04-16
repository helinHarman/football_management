package dataprojectreal;
public class HashTablePlayer {
   

Player player;
    
    public Player[] table;
    public int prime;
    public int size;
    
    public HashTablePlayer(int capacity){
        prime = 17;
        table = new Player[capacity];
        
        for(int i = 0; i < capacity; i++){
            table[i] = null;
        }
        
        size = 0;
    }
    
    public void putLinear(Player player){
        int index = hash(player.playerID);
        int originalIndex = index;
        
        while(table[index] != null){
            if(table[index].playerID == player.playerID){
                System.out.println("Player already exists: " + player);
                return;
            }
            index = (index + 1) % table.length;
            if(index == originalIndex){
                System.out.println("Hash table is full");
                return;
            }
        }
        
        table[index] = player;
        size++;
    }
 
    
    public int hash(int key){
        return key % table.length;
    }
    
    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + ": " + (table[i] != null ? table[i].playerName : "null"));
        }
    }

 
    public Player[] getTable() {
        return table;
    }

    public void setTable(Player[] table) {
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


