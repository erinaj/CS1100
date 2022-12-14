
/**
 * This is a class to test the PlayerPiece class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPieceTester
{
    public static void main(String[] args) {
      //create a PlayerPiece object
      //this is equivalent to right clicking
      //a class in BlueJ and creating an object
      PlayerPiece piece01 = new PlayerPiece();
      //by default, all instance vars 
      //in PlayerPiece are set to 0
     
	 //actual results
      System.out.println("Current/Total HP = " + 
                    piece01.getCurrentHealth() + "/" + 
                    piece01.getMaxHealth());

	//expected results
	//we expect the values to be 0 initially because we have not set 
	//any other specific values in the PlayerPiece.java file
      System.out.println("Expected 100/100");
    
      //Below this line you need to add tests 
      //first you will test your constructors.
      //test the  no argument constructor, and make sure
      //that the default values are set correctly (use method calls)
      //next, test the constructor that has several arguments
      //use method calls again to test these values are set correctly
      
      //Printing real and expected values for all the variables in PlayerPiece
      System.out.println("The value of locX = " +piece01.getLocX());
      System.out.println("Expected locX: 7");
      System.out.println("The value of locY = "+piece01.getLocY());
      System.out.println("Expected locY: 8");
      System.out.println("The value of attack power = "+piece01.getAttackPower());
      System.out.println("Expected attack power: 25");
      System.out.println("The value of defense power = "+piece01.getDefensePower());
      System.out.println("Expected defense power: 20");
      System.out.println("Current/Max Special Power = " + 
                    piece01.getCurrentSpecialPower() + "/" + 
                    piece01.getMaxSpecialPower());
      System.out.println("Expected 50/50");
      
      //Step 13: testing and printing the move methods
      piece01.moveUp();
      System.out.println("The value of locY = "+piece01.getLocY());
      piece01.moveDown();
      System.out.println("The value of locY = "+piece01.getLocY());
      piece01.moveLeft();
      System.out.println("The value of locX = "+piece01.getLocX());
      piece01.moveRight();
      System.out.println("The value of locX = "+piece01.getLocX());
      
      //Step 15: testing the mutator setLocXY
      System.out.println("The value of locY = "+piece01.getLocY());
      System.out.println("The value of locX = "+piece01.getLocX());
      
      
    }
    
    
   

    }
    
