
/**
 * Write a description of class NumberCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberCalculator
{
    //creating 2 variables
    private int a;
    private int b;
    
    //constructor for paper values
    public NumberCalculator(int givenA, int givenB){
        a = givenA;
        b = givenB;
    }
    //creating accessor methods for the following calculations
    public int getSum(){
        return a+b;
    }
    public int getDifference(){
        return a-b;
    }
    public int getProduct(){
        return a*b;
    }
    public double getAverage(){
        double a1 = (double)a; //changing variables to doubles to properly calulate average
        double b1 = (double)b;
        return (a1+b1)/2;
    }
    public int getDistance(){
        return Math.abs(a-b);
    }
    public int getMaximum(){
        return Math.max(a,b);
    }
    public int getMinimum(){
        return Math.min(a,b);
    }
    
}
