
/**
 * Write a description of class Dwarf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dwarf extends PlayerPiece
{
    //Step 24: creating instance variables
    private int maxStrength = 50;
    private int currentStrength =50;
    //Step 25: creating accessor methods
    public int getMaxStrength()
    {
        return maxStrength;
    }
    public int getCurrentStrength()
    {
        return currentStrength;
    }
    //Step 27: creating mutator methods
    public void setMaxStrength(int maxS)
    //set maxStrength to value received as a parameter, maxS
    {
        maxStrength = maxS;
    }
    public void setCurrentStrength(int currentS)
    //set currentStrength to value received as a parameter, currrentS
    {
        currentStrength = currentS;
    }
}
