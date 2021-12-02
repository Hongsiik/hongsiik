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

    public boolean equals(Object obj, Object obj2) {
        if (obj instanceof Player) {
            if (obj2 instanceof Player){
                Player player = (Player) obj;
                Player player2 = (Player) obj2;
                if (firstName.equals(player.firstName)) {
                    if(jerseyNumber.equals(player2.jerseyNumber)){
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
























//public Player(String firstName, String lastName, int jerseyNumber){
//this.setfirstName(firstName);
//this.setlastName(lastName);
// this.setjerseyNumber(jerseyNumber);
// }
// public String getfirstName(){
//    return firstName;
// }
// public void setfirstName(String firstName){
//     this.firstName = firstName;
// }
//  public String getlastName(){
//      return lastName;
// }
//  public void setlastName(String lastName){
//     this.lastName = lastName;
// }

// public int getjerseyNumber(){
//    return jerseyNumber;
// }
//  public void setjerseyNumber(int jerseyNumber){
//      this.jerseyNumber = jerseyNumber;
// }



