
/**
 * Write a description of class DigitalThermometer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitalThermometer
{
    private double Vm;
    //initilizing given variables
    private double Rs = 75;
    private double Vs = 20;
    private double R0 = 100;
    private double k = 0.5;
    //initializing result
    private double temp;
    
    //constructor to accept values
     public DigitalThermometer(double givenDouble){
        Vm = givenDouble;
    }
    //mutator method
    public void setValue(double newD){
      this.Vm = newD;
    }
    //accesor method
    public double getValue(){
        return Vm;
    }
    //method that sets value temp to the given formula for caluculating temp from Vm
    public void calculateTemp(){
        if (Vm >= 12 && Vm <= 18){
            temp = (Rs / k)*(Vm / (Vs-Vm)) - (R0 / k);
            System.out.printf("If the voltage is "+getValue()+" the Temperature is %.2f" ,temp);
            System.out.println();
        }else {
            System.out.println("Error: Voltage out of range");
        }

    }
}
