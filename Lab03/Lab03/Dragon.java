
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon extends PlayerPiece
{
    //Step 35: creating instance variables
    private int maxFire = 50;
    private int currentFire =50;
    //Step 35: creating accessor methods
    public int getMaxFire()
    {
        return maxFire;
    }
    public int getCurrentFire()
    {
        return currentFire;
    }
    //Step 35: creating mutator methods
    public void setMaxFire(int maxF)
    //set maxFire to value received as a parameter, maxF
    {
        maxFire = maxF;
    }
    public void setCurrentFire(int currentF)
    //set currentFire to value received as a parameter, currrentS
    {
        currentFire = currentF;
    }
}
