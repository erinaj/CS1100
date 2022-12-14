
/**
 * Write a description of class TuningCircuit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TuningCircuit
{
    private double freq;
    private double cMin;
    private double cMax;
    
    //declaring variables to make equation more readable
      double pi = Math.PI; //assigning pi to pi
      double num = 4 * pi * pi; //numerator for L
      double c; 
      double denom;
      double l;
    
    //creating constructor for circuit01 object
    public TuningCircuit(double givenFreq, double givenCMin, double givenCMax){
        freq = givenFreq;
        cMin = givenCMin;
        cMax = givenCMax;
        
        c = Math.sqrt((givenCMin*givenCMax)); //formula for c
        denom = c * givenFreq * givenFreq; //denominator for f
        l = num / denom; //equation for L
    
    }
    //accessor methods with formulas for FMin and FMax and converstion from MHz to hertz
    public double getFMin(){
         return ((2*pi) / Math.sqrt(l*cMax)) *1000000; 
    }
    public double getFMax(){
        return ((2*pi) / Math.sqrt(l*cMin)) *1000000;
    }
    
}
