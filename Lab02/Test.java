
import java.awt.Rectangle;
public class Test
{
    public static void main(String[] args) {
        System.out.println("House Calculations begin now:");
        //double variables of house in feet, below:
        double hHouse = 25.5; //initialize height of house
        double wHouse = 65.2;  //initialize width of house
        double dHouse = 75.75;  //initialize depth of house
        /* format print for labels and dimensions below. 
         * %.2f means float with 2 decimal places     */
        System.out.printf("%nHeight of House: %.2f%nWidth of house:  %.2f%nDepth of house:  %.2f%n", hHouse, wHouse, dHouse);
        //step 3 variables below:
        double hWin = 1.2;   //initialize height of windows
        double wWin = 0.75;  //initialize width of windows
        int numWin = 19;     //initialize number of windows
        //step 4 variables below:
        double hDoor = 1.75;   //initialize height of doors
        double wDoor = 0.95;   //initialize width of doors
        int numDoor = 5;       //initialize number of doors
        //window print:
        System.out.printf("%nHeight of Windows: %.2f%nWidth of Windows:  %.2f%nNumber of Windows:  %d %n", hWin, wWin, numWin);
        //door print:
        System.out.printf("%nHeight of Doors: %.2f%nWidth of Doors:  %.2f%nNumber of Doors:  %d %n", hDoor, wDoor, numDoor);
        //step 6 below:
        double surFloor = 0; //floor SA
        double surLeft  = 0; //left wall SA
        double surRight = 0; //right wall SA
        double surFront = 0; //front wall SA
        double surBack  = 0; //back wall SA
        double surRoof  = 0; //roof/ceiling SA
        //step 7 below:
        double surWhole = 0; //surface area including windows
        double surSub   = 0; //surface area excluding windows
        //step 8 strings initialized below:
        String s1 = "good";
        String s2 = "bad";
        String s3 = "boring";
        String s4 = "exciting";
        String s5 = "big";
        String s6 = "small";
        String s7 = "Naveena"; //name
        //step 10 below:
        surFloor = wHouse * dHouse; //width * depth = top and bottom
        surRoof = surFloor; //sets top equal to bottom
        surLeft = dHouse * hHouse; //height * depth = side
        surRight = surLeft; //sides are equal, changes surRight
        surFront = wHouse * hHouse; //height * width = front or back
        surBack = surFront; //makes surBack equal surFront's new value
        //print below:
        System.out.printf("%nSurface Area of Floor and Roof:       %.2f and %.2f%nSurface Area of Left and Right Walls: %.2f and %.2f%nSurface Area of Front and Back Walls: %.2f and %.2f%n", surFloor, surRoof, surLeft, surRight, surFront, surBack);
        //step 11 below:
        surWhole = (surFloor * 2) + (surLeft * 2) + (surFront * 2); //total SA calculation
        //step 12 below:
        System.out.printf("%nThis is %s's %s house. %nThe surface area is %.2f.", s7, s1, surWhole); //prints name, adjective, and SA
        //step 13 below:
        double surWinTotal = wWin * hWin * numWin; //area of all windows together
        surSub = surWhole - surWinTotal; //whole SA - window SA
        //step 14 below:
        System.out.printf("%nThe surface area minus windows is %.2f%n", surSub); //print
        //step 15 below:
        surSub = surSub - numDoor * hDoor * wDoor; //new surSub = SA - door total SA
        System.out.printf("%nThe surface area minus doors and windows is %.2f", surSub); //print
        System.out.printf("%nThis %s house belongs to %s", s5, s7); //print w/ adjective
        //step 17 below:
        var myRec = new Rectangle(7, 13, 5, 10); //creates rectangle named myRec
        //more (18 - 21) below:
        System.out.printf("%n%nRectangle x coordinate: " + myRec.getX() + "%n"); //print x
        System.out.printf("Rectangle y coordinate: " + myRec.getY() + "%n"); //print y
        System.out.printf("Rectangle width:  " + myRec.getWidth() + "%n"); //print w
        System.out.printf("Rectangle height: " + myRec.getHeight() + "%n"); //print h
        //step 22 below
        myRec.grow(2, 4); //2*2 = 4, 4*2 = 8
        System.out.printf("%n%nRectangle x coordinate: " + myRec.getX() + "%n"); //print x
        System.out.printf("Rectangle y coordinate: " + myRec.getY() + "%n"); //print y
        System.out.printf("Rectangle width:  " + myRec.getWidth() + "%n"); //print w
        System.out.printf("Rectangle height: " + myRec.getHeight() + "%n"); //print h
        myRec.translate(2, 4); //right AND down
        System.out.printf("%n%nRectangle x coordinate: " + myRec.getX() + "%n"); //print x
        System.out.printf("Rectangle y coordinate: " + myRec.getY() + "%n"); //print y
    }
}