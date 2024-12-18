
import java.util.ArrayList; 

public class fairyAdventure{
// Attributes 
    public boolean isChildSleeping; 
    public boolean isTooth; 
    ArrayList <String> fairyBag = new ArrayList <>(); 
    public String note; 
    public String toothLocation;  
    public int fairyLocationX; 
    public int fairyLocationY; 
    public boolean canFly; 
    public boolean canWalk; 
    public int fairyHeight; 


/**
 * Constructor for fairy adventure 
 * @param isChildSleeping
 * @param isTooth
 * @param note
 * @param toothLocation
 * @param fairyLocationX
 * @param fairyLocationY
 * @param fairyHeight
 */
public fairyAdventure(Boolean isChildSleeping, Boolean isTooth, String note, String toothLocation, int fairyLocationX, int fairyLocationY, int fairyHeight, boolean canFly, boolean canWalk){
    this.isChildSleeping = isChildSleeping; 
    this.isTooth = isTooth; 
    this.note = note; 
    this.toothLocation = toothLocation; 
    this.fairyLocationX = 0; 
    this.fairyLocationY = 0; 
    this.fairyHeight = 1; 
    this.canFly = canFly; 
    this.canWalk= canWalk; 
}


/**
 * Checks if the conditions are right to enter the room 
 */

    void enterRoom(){
        if (this.isChildSleeping && this.isTooth == true){
            System.out.println("The tooth fairy has found the right room and the conditions are right to proceed with the program!");
        }
        else{
           System.out.println("The tooth fairy can't go here. Please try again with other conditions!"); 
        }
    }
/**
 * Lets the fairy grab the note and tooth and add it to the inventory 
 */
    void grab(){
      fairyBag.add(this.note); 
      toothLocation = "In Bag"; 
      System.out.println("Your note and tooth is now in the bag!");
    }
/**
 * Lets the fairy drop the tooth and note 
 *
 */
    String drop(){
       fairyBag.remove(this.note); 
       this.toothLocation = "On the Ground"; 
       System.out.println("your tooth is now at" + this.toothLocation);
       return this.toothLocation;
    }
/**
 * Lets fairy read the note 
 */
    void examine(){
        System.out.println("shhhh! this notes reads: " + this.note);
    }
/**
 * Lets the fairy use the note for her stash of notes 
 */
    void use(){
        fairyBag.remove(this.note); 
        System.out.println("You now have used the note you collected. If you need another note go find one!");
    }
/**
 * Lets the fairy walk if they have the capacity 
 * @param direction
 * @return canWalk 
 */
    boolean walk(String direction){
        if(this.canWalk == true){
            this.fairyLocationX = fairyLocationX + 1; 
            this.fairyLocationY = 0; 
            System.out.println("You are now at " + fairyLocationX + "," + fairyLocationY);
            return true;       
        }
        else{
            System.out.println("You cannot walk! Try something else");
            return false;
        }
    }
/**
 * Lets the fairy fly if they have the capacity 
 * @param fairyLocationX
 * @param fairyLocationY
 * @return canFly 
 */
    boolean fly( int fairyLocationX, int fairyLocationY){
        if(this.canFly == true){
            this.fairyLocationX = 0; 
            this.fairyLocationY = fairyLocationY + 1; 
            System.out.println("You are now at " + fairyLocationX + ", " + fairyLocationY);
            return true;       
        }
        else{
            System.out.println("You cannot fly! Try something else");
            return false;
        }
            
    }
/**
 * Shrinks the fairy 
 * @return fairyHeight 
 */
    Number shrink(){
        this.fairyHeight = fairyHeight - 1; 
        System.out.println("You shrunk one fairy inch! "  + "You are now " + fairyHeight + " fairy inches tall");
        return fairyHeight; 
    }
/**
 * Grows the fairy 
 * @return fairyheight 
 */
    Number grow(){
        if (fairyHeight < 0){
            throw new RuntimeException("You can't shrink anymore!"); 
        }
        this.fairyHeight = fairyHeight + 1; 
        System.out.println("You grew one fairy inch! " + "You are now " + fairyHeight + " fairy inches tall");
        return fairyHeight; 
    }
    
/**
 * Lets the fairy rest by going back to their home 
 */
    void rest(){
        System.out.println("This fairy is sleeping and went home!");
        this.fairyLocationX = 0; 
        this.fairyLocationY = 0; 
    }
/**
 * Lets the fairy undo their actions which brings them back to the start and empty's their inventory 
 */
    void undo(){
        this.fairyLocationX = 0; 
        this.fairyLocationY = 0; 
        fairyBag.clear(); 
        this.fairyHeight = 1; 
        System.out.println("You restarted your journey and all the faries lost all their collections.");
    }
/**
 * Creates a fairy 
 * @param args
 */
    public static void main(String[] args) {
        fairyAdventure fairyOne = new fairyAdventure(true, true, "I really want a present", "under pillow", 0, 0, 0, true, true); 
        fairyOne.enterRoom();
        fairyOne.grab();
        fairyOne.examine();
        fairyOne.drop(); 
        fairyOne.use();
        fairyOne.fly(2, 2); 
        fairyOne.walk("North"); 
        fairyOne.grow(); 
        fairyOne.shrink(); 
        fairyOne.rest(); 
        fairyOne.undo();
      }
    }
