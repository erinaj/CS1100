
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends PlayerPiece
{
    //Step 23: creating instance variables
    private int maxMagic = 50;
    private int currentMagic =50;
    //Step 25: creating accessor methods
    public int getMaxMagic()
    {
        return maxMagic;
    }
    public int getCurrentMagic()
    {
        return currentMagic;
    }
    //Step 27: creating mutator methods
    public void setMaxMagic(int maxM)
    //set maxMagic to value received as a parameter, maxM
    {
        maxMagic = maxM;
    }
    public void setCurrentMagic(int currentM)
    //set currentMagic to value received as a parameter, currrentM
    {
        currentMagic = currentM;
    }
}
