
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{
    //declaring instance variables to represent coordinates of triangle
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    
    //constructer for myTriangle object 
    public Triangle(double myX1, double myY1, double myX2, double myY2, double myX3, double myY3){
        x1 = myX1;
        y1 = myY1;
        x2 = myX2;
        y2 = myY2;
        x3 = myX3;
        y3 = myY3;
    }
    
    //accessor methods to calculate side lengths
    public double getSide1Length(){
        return Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3)); 
    }
    public double getSide2Length(){
        return Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
    }
    public double getSide3Length(){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    
    //accesor method for finding angles
    public double getAngle1(){
        //using Law of Cosine to find Angle 1
        //setting side lengths to more readable variables
        double l1 = getSide1Length();
        double l2 = getSide2Length();
        double l3 = getSide3Length();
        //formula for cos of angle 1
        double cos1 = ((l2*l2)+(l3*l3)-(l1*l1))/(2*l2*l3);
        //finds inverse cos of angle 1 and converts it from radians to degrees 
        return Math.toDegrees(Math.acos(cos1));
    }
    public double getAngle2(){
        //using Law of Cosine to find Angle 2
        //setting side lengths to more readable variables
        double l1 = getSide1Length();
        double l2 = getSide2Length();
        double l3 = getSide3Length();
        //formula for cos of angle 2
        double cos2 = ((l1*l1)+(l3*l3)-(l2*l2))/(2*l1*l3);
        //finds inverse cos of angle 1 and converts it from radians to degrees 
        return Math.toDegrees(Math.acos(cos2));
    }
    public double getAngle3(){
        //formula for finding angle 3
        return 180 - getAngle1() - getAngle2();
    }
    
    //accessor method for perimeter and area
    public double getPerimeter(){
        return getSide1Length()+getSide2Length()+getSide3Length();
    }
    public double getArea(){
        //using Heron's formula to find area of trangle
        //setting side lengths to more readable variables
        double l1 = getSide1Length();
        double l2 = getSide2Length();
        double l3 = getSide3Length();
        //creating varibale for p which represents half the perimeter
        double p = (l1+l2+l3) / 2;
        //formula for area using p
        return Math.sqrt(p * (p-l1)*(p-l2)*(p-l3));
    }
}
