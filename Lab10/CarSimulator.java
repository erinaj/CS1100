
/**
 * Write a description of class CarSimulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarSimulator
{
    public static enum GearShift { P, N, D, ONE, TWO, THREE, R };
    GearShift gs;
    
    public String checkDoors(int leftDashSwitch, int rightDashSwitch, int childLock, int masterUnlock, 
    int leftInside, int rightInside, int leftOutside, int rightOutside, GearShift gear){
        //initializing the state of the door and result string                                                                                               
        boolean leftOpen = false;
        boolean rightOpen = false;
        String result;
        /*conditions for left to be open: opened either by dash switch, outside or inside.
         * if opened with inside then child lock must be off. master unlock must be on, 
         * and gear shift must be in P
         */
        if ((leftDashSwitch == 1 || leftOutside == 1 || (leftInside == 1 && childLock == 0))
        && masterUnlock == 1 && gear == GearShift.P){
            leftOpen = true;
        }
        //conditions for right to be open, same as left
        if ((rightDashSwitch == 1 || rightOutside == 1 || (rightInside == 1 && childLock == 0))
        && masterUnlock == 1 && gear == GearShift.P){
            rightOpen = true;
        }
        //if statement that sets result to proper statement
        if( rightOpen && leftOpen ){
            result = "Both Doors Open";;
        }
        else if(rightOpen){
            result = "Right Door Only";
        }
        else if(leftOpen){
            result = "Left Door Only";
        }
        else{
            result = "Both Doors Locked";
        }
        return result;
    }
}
