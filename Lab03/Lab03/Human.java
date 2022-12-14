
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends PlayerPiece
{
    //Step 22: creating instance variables
    private int maxSpirit = 50;
    private int currentSpirit =50;
    //Step 25: creating accessor methods
    public int getMaxSpirit()
    {
        return maxSpirit;
    }
    public int getCurrentSpirit()
    {
        return currentSpirit;
    }
    //Step 27: creating mutator methods
    public void setMaxSpirit(int maxS)
    //set maxSpirit to value received as a parameter, maxS
    {
        maxSpirit = maxS;
    }
    public void setCurrentSpirit(int currentS)
    //set currentSpirit to value received as a parameter, currrentS
    {
        currentSpirit = currentS;
    }
}
