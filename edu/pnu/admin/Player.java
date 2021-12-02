package edu.pnu.admin;
import edu.pnu.collection.GenericList;

public class Player {
    private String firstName;
    private String lastName;
    private Integer jerseyNumber;

    public Player(String firstName){
        this.firstName = firstName;

    }

    public Player(Integer jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }


    public Player(String firstName, String lastName, Integer jerseyNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
    }

    public boolean equals(Object c, Object d) {
        GenericList a = new GenericList();
        GenericList b = new GenericList();
        if (c instanceof Player) {
            if(d instanceof Player){
                Player player1 = (Player) c;
                Player player2 = (Player) d;
                if (firstName.equals(player1.firstName)) {
                    if (jerseyNumber.equals((player2.jerseyNumber))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public String toString(){
        return "["+lastName+", "+firstName+" "+jerseyNumber+"]";
    }
}







