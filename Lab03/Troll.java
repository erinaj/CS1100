
/**
 * Write a description of class Troll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Troll extends PlayerPiece
{
    //Step 35: creating instance variables
    private int maxHate = 50;
    private int currentHate =50;
    //Step 35: creating accessor methods
    public int getMaxHate()
    {
        return maxHate;
    }
    public int getCurrentHate()
    {
        return currentHate;
    }
    //Step 35: creating mutator methods
    public void setMaxHate(int maxH)
    //set maxHate to value received as a parameter, maxH
    {
        maxHate = maxH;
    }
    public void setCurrentHate(int currentH)
    //set currentHate to value received as a parameter, currrentS
    {
        currentHate = currentH;
    }
}
