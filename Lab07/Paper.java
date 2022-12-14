
/**
 * Write a description of class Paper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Paper
{
    //creating variables for height and width
    private double height;
    private double width;
    final public double mmperin = 25.4; //mm per inch conversion
    
    //constructor for paper values
    public Paper(double givenHeight, double givenWidth){
        height = givenHeight;
        width = givenWidth;
    }
    //creating accessor methods for width and height in mm
    public double getWidthInMillimeters(){
        return width*mmperin;
    }
    public double getHeightInMillimeters(){
        return height*mmperin;
    }
    //creating accessor methods for width and height in inches
    public double getWidthInInches(){
        return width;
    }
    public double getHeightInInches(){
        return height;
    }
    
}
