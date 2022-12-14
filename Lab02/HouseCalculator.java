// Erin Jones HPY346

import java.awt.Rectangle;

public class HouseCalculator
{
    public static void main(String[] args) {
        System.out.println("House Calculations begin now:");
        //Your code for Lab02 will begin below this line...
        double hHouse = 25.50; //initializing height of house
        double wHouse = 65.20; //initializing width of house
        double dHouse = 75.75; //initializing depth of house
        System.out.println("The height of the house is "+hHouse );
        System.out.println("The width of the house is "+wHouse );
        System.out.println("The depth of the house is "+dHouse );
        //Step 3 variables: window
        double hWindow = 1.20; //height of windows
        double wWindow = 0.75; //width of windows
        int nWindow = 19; // number of windows
        //Step 4 variables: door
        double hDoor = 1.75; //height of doors
        double wDoor = 0.95; //width of doors
        int nDoor = 5; //number of doors
        //Step 5 printing door and window dimensions
        System.out.println("");
        System.out.println("The height of the windows is "+hWindow);
        System.out.println("The width of the windows is "+wWindow);
        System.out.println("The number of the windows is "+nWindow);
        System.out.println("");
        System.out.println("The height of the doors is "+hDoor);
        System.out.println("The width of the doors is "+wDoor);
        System.out.println("The number of doors is "+nDoor);
        //Step 6 declaring surface area 
        double saFloor = 0; //floor SA
        double saLeft  = 0; //left wall SA
        double saRight = 0; //right wall SA
        double saFront = 0; //front wall SA
        double saBack  = 0; //back wall SA
        double saRoof  = 0; //roof SA
        //Step 7 declaring total surface area
        double saWhole = 0; //SA including windows and doors
        double saNew =0; //SA excluding windows and doors
        //Step 8 strings initialized
        String s1 = "good";
        String s2 = "bad";
        String s3 = "boring";
        String s4 = "exciting";
        String s5 = "big";
        String s6 = "small";
        String s7 = "Erin"; //my name
        //Step 10 calculating surface area
        saFloor = wHouse * dHouse; //floor = width * depth
        saRoof = saFloor; //roof is equal to floor
        saLeft = dHouse * hHouse; //left side is = depth * height
        saRight = saLeft; //left and right sides are equal
        saFront = wHouse * hHouse; //front = width * height
        saBack = saFront; //front and back are equal
        //printing previous calculations
        System.out.println(""); //skipping line
        System.out.println("The surface area of the floor and roof is "+saFloor+" for each.");
        System.out.println("The surface area of the left and right walls is "+saRight+" for each.");
        System.out.println("The surface area of the front and back wall is "+saFront+" for each.");
        saWhole = (saFloor*2) + (saLeft*2) + (saFront*2);//whole surface area calculation
        //Step 12
        System.out.println(); //skipping line
        System.out.println("This is "+s7+"'s " +s6+" and "+s3+" house and it has a surface area of "+saWhole);   
        //step 13
        double saWindow = wWindow * hWindow *nWindow; //total area of windows
        double saNew1 = saWhole - saWindow;//whole SA minus window area = value without windows
        //step 14
        System.out.println("The surface area minus the windows is "+saNew1); 
        //step 15
        double saDoor = wDoor * hDoor * nDoor;//total area of doors
        saNew = saNew1 - saDoor; //subtracting sa doors from sa of house without windows
        System.out.println("The surface area minus the windows and doors is "+saNew);
        System.out.println("This house belongs to "+s7+" and is pretty "+s1);
        //step 17
        Rectangle myRectangle = new Rectangle(7,13,5,10);//creates myRectangle
        //steps 18-21
        System.out.println();//skipping line
        System.out.println("Rectangle x location: " +myRectangle.getX());//printing x
        System.out.println("Rectangle y location: " +myRectangle.getY());//printing y
        System.out.println("Rectangle width: " +myRectangle.getWidth());//printing width
        System.out.println("Rectangle height: " +myRectangle.getHeight());//printing height
        //step 22
        myRectangle.grow (2,4);// does 2 in each x direction making 4 total; and 4 in each y direction making 8 total
        //step 23
        System.out.println();//skipping line
        System.out.println("After growing Rectangle:");
        System.out.println("Rectangle x location: " +myRectangle.getX());//printing new x
        System.out.println("Rectangle y location: " +myRectangle.getY());//printing new y
        System.out.println("Rectangle width: " +myRectangle.getWidth());//printing new width
        System.out.println("Rectangle height: " +myRectangle.getHeight());//printing new height
        //step 24
        myRectangle.translate(2,4);
        //step 25
        System.out.println();//skipping line
        System.out.println("After translating Rectangle:");
        System.out.println("Rectangle x location: " +myRectangle.getX());//printing x
        System.out.println("Rectangle y location: " +myRectangle.getY());//printing y
    }
}
