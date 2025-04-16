package dataprojectreal;
public class PlayerList {
    
    public int size;
    public Node head;
    
    public PlayerList(){
        this.head=null;
        this.size=0;
    }
    public boolean isEmpty(){
        if(this.head==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void addPlayerToList(Player newPlayer){
        Node newNode=new Node(newPlayer);
         if (head == null) {
            head = newNode;
            size++;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
           size++;
        } 
    }
    
    public void deletePlayer(int playerID) {
    if (head == null) {
        return;
    }
    if (head.player.playerID == playerID) {
        if (head.next == null) {
        } 
        else {
            head = head.next;  
        }
        size--;  
        return;
    }
    Node current = head;
    while (current.next != null && current.next.player.playerID != playerID) {
        current = current.next;
    }

    if (current.next == null) {
        System.out.println("Eleman listede bulunamadı.");
    } else {
        current.next = current.next.next;
        size--; 
    }
}

    
    
    
    public void printPlayerList(){
        Node current=this.head;
        
        int i=1;
          while(current != null){
            System.out.println(i+". "+current.player.playerName);
            current=current.next;
            i++;
        }
    }
    
    
    
    public static class Node{
        Player player;
        Node next;

        public Node(Player player) {
            this.player = player;
            this.next = null;
        }

        public Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        
}

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

        
        
    
}

