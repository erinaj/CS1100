import java.awt.Rectangle;

//ENTER NAME HERE
//ENTER UTC ID HERE
//DO THIS FOR EVERY ASSIGNMENT THIS SEMESTER!!! (worth 5 pts)\
 public class HelloPrinter
{
    public static void main(String[] args) {//begin main
        //constructor
        Rectangle myRectangle = new Rectangle(10,20,40,60);
        System.out.println(myRectangle);
        //Accessor Getter Read the contents
        double x = myRectangle.getX();
        System.out.println("x of this rectangle is "+x);
        double y = myRectangle.getY();
        System.out.println("y of this rectangle is "+y);
        double width = myRectangle.getWidth();
        System.out.println("width of this rectangle is "+width);
        double height = myRectangle.getHeight();
        System.out.println("height of this rectangle is "+height);
        //Mutator Setter write the contents
        myRectangle.translate(100,200);
        System.out.println(myRectangle);
        myRectangle.grow(40,50);
        System.out.println(myRectangle);
    } //end main
}
