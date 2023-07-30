package Lablesson2;

  public class Item {

    private int location;
    private String description;

    // constructor

    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }
    // getter and setter methods
    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
// add another class
class Monster extends Item{
     //constructor
    public Monster(int location,String Description){
        super(location,Description);
    }

}
