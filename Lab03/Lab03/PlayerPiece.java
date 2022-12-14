
/**
 * Write a description of class PlayerPiece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayerPiece extends BoardPiece
{
    //Step 10: delcaring and initializing instance variables
    private int currentHealth = 100; //delcaration, initialization
    private int maxHealth = 100;
    private int locX = 15; 
    private int locY = 13;
    private int attackPower = 12;
    private int defensePower = 10;

    //Step 14: declaring and returning accessor methods
    public int getMaxHealth()
    {
        return maxHealth;
    }
    
    public int getCurrentHealth()
    {
        return currentHealth;
    }
    
    public int getLocX()
    {
        return locX;
    }
    
    public int getLocY()
    {
        return locY;
    }
    
    public int getAttackPower()
    {
        return attackPower;
    }
    
    public int getDefensePower(int y)
    {
        return defensePower;
    }
    
    
    //Step 16: creating mutator methods
    public void moveUp()
    {
    
    }
    
    public void moveDown()
    {
    
    }
    
    public void moveLeft()
    {
    
    }
    
    public void moveRight()
    {
    
    }
    
    
}
