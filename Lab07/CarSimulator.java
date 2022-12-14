
/**
 * Write a description of class CarSimulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarSimulator
{
    //creating instance variables
    private double gal;
    private double mpergal;
    private double price;
    
    //creating constructor for car01 object
    public CarSimulator(double newGal, double newMpergal, double newPrice){
        gal = newGal;
        mpergal = newMpergal;
        price = newPrice;
    }
    //accessor methods for cost per 100 miles and total distance 
    public double getCostPer100Miles(){
        return (price/mpergal)*100;
    }
    public double getDistance(){
        return gal*mpergal;
    }
    
}
