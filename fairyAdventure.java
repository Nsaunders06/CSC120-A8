
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


//Constructor 
public fairyAdventure(Boolean isChildSleeping, Boolean isTooth, String note, String toothLocation, int fairyLocationX, int fairyLocationY){
    this.isChildSleeping = isChildSleeping; 
    this.isTooth = isTooth; 
    this.note = note; 
    this.toothLocation = toothLocation; 
    this.fairyLocationX = 0; 
    this.fairyLocationY = 0; 
}


//Methods 
    void enterRoom(boolean isChildSleeping, boolean isTooth){
        if (this.isChildSleeping && this.isTooth == true){
            System.out.println("The tooth fairy has found the right room and the conditions are right to proceed with the program!");
        }
        else{
           System.out.println("The tooth fairy can't go here. Please try again with other conditions!"); 
        }
    }

    void grab(String note, String toothLocation){
      fairyBag.add(note); 
      toothLocation = "In Bag"; 
      System.out.println("Your note and tooth is now in the bag!");
    }

    String drop(String note, String toothLocation){
       fairyBag.remove(note); 
       this.toothLocation = "On the Ground"; 
       System.out.println("your tooth is now at" + toothLocation);
       return toothLocation;
    }

    void examine(String note){
        System.out.println("shhhh! this notes reads" + this.note);
    }

    void use(String item){
        
    }

    boolean walk(String direction){
        if(this.canWalk == true){
            this.fairyLocationX = fairyLocationX + 1; 
            this.fairyLocationY = 0; 
            System.out.println("You are now at" + fairyLocationX + fairyLocationY);
            return true;       
        }
        else{
            System.out.println("You cannot walk! Try something else");
            return false;
        }
    }

    boolean fly(boolean canFly, int fairyLocationX, int fairyLocationY){
        if(this.canFly == true){
            this.fairyLocationX = 0; 
            this.fairyLocationY = fairyLocationY + 1; 
            System.out.println("You are now at" + fairyLocationX + fairyLocationY);
            return true;       
        }
        else{
            System.out.println("You cannot fly! Try something else");
            return false;
        }
            
    }

    Number shrink(){

    }

    Number grow(){

    }

    void rest(){
        System.out.println("This fairy is sleeping!");

    }

    void undo(){

    }

    public static void main(String[] args) {
        
      }
}
