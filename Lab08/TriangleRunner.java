import java.util.Scanner;// imports scanner class
/**
 * Write a description of class TriangleRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleRunner
{
    public static void main(String[] args) {
        System.out.println("Enter the x,y coordinates of three points in this order: x1,y1,x2,y2,x3,y3");
        //creating scanner
        Scanner myTriangle = new Scanner(System.in);
        double x1 = myTriangle.nextDouble();
        double y1 = myTriangle.nextDouble();
        double x2 = myTriangle.nextDouble();
        double y2 = myTriangle.nextDouble();
        double x3 = myTriangle.nextDouble();
        double y3 = myTriangle.nextDouble();
        //creating object with six variables entered in scanner
        Triangle triCal = new Triangle(x1,y1,x2,y2,x3,y3);
        
        //printing lengths 
        System.out.printf("The length of side 1 is %.3f",triCal.getSide1Length());
        System.out.println();//skip line
        System.out.printf("The length of side 2 is %.3f",triCal.getSide2Length());
        System.out.println();//skip line
        System.out.printf("The length of side 3 is %.3f",triCal.getSide3Length());
        System.out.println();//skip line
        //printing angles
        System.out.printf("Angle 1 is %.3f" ,triCal.getAngle1());
        System.out.println();//skip line
        System.out.printf("Angle 2 is %.3f" ,triCal.getAngle2());
        System.out.println();//skip line
        System.out.printf("Angle 3 is %.3f" ,triCal.getAngle3());
        System.out.println();//skip line
        //printing perimeter and area
        System.out.printf("The perimeter of the triangle is %.3f",triCal.getPerimeter());
        System.out.println();//skip line
        System.out.printf("The area of the triangle is %.3f",triCal.getArea());
        

    }
}
