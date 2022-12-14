
/**
 * Write a description of class DoubleAnalyzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleAnalyzer
{
    double d;
    //constructor to accept values
    public DoubleAnalyzer(double givenDouble){
        d = givenDouble;
    }
    //mutator method
    public void setValue(double newD){
      this.d = newD;
    }
    //accesor method
    public double getValue(){
        return d;
    }
    public void analyzeDouble(){
        //returns positive/negative/zero 
        if (d > 0){
            System.out.print("The value of "+getValue()+" is positive");
        }else if (d == 0){
            System.out.print("The value of "+getValue()+" is zero");
        }else {
            System.out.print("The value of "+getValue()+" is negative");
        }
        //returns size of number 
        if (Math.abs(d) < 1){
            System.out.println(" and small");
        } 
        if(Math.abs(d) >1000000) {
            System.out.println(" and large");
        }
    }
}
