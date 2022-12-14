
/**
 * Write a description of class DigitPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitPrinter
{
    private int i;
    //constructor to accept values
    public DigitPrinter(int givenInt){
        i = givenInt;   
    }
    //mutator method
    public void setValue(int newInt){
      this.i = newInt;
    }
    //accesor method
    public int getValue(){
        return i;
    }
    //method that prints number of digits for numbers up to 10 million
    //using Math.abs() to account for negative numbers
    public void printDigits(){
        if (Math.abs(i)>=10000000){
            System.out.println(getValue()+" has 8 digits");
        }else if (Math.abs(i)>=1000000) {
            System.out.println(getValue()+" has 7 digits");
        }else if (Math.abs(i)>=100000){
            System.out.println(getValue()+" has 6 digits");
        }else if (Math.abs(i)>=10000){
            System.out.println(getValue()+" has 5 digits");
        }else if (Math.abs(i)>=1000){
            System.out.println(getValue()+" has 4 digits");
        }else if (Math.abs(i)>=100){
            System.out.println(getValue()+" has 3 digits");
        }else if (Math.abs(i)>=10){
            System.out.println(getValue()+" has 2 digits");
        }else if (Math.abs(i)>=0){
            System.out.println(getValue()+" has 1 digit");
        }
        
    }
}
