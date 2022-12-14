import java.util.Scanner;  
/**
 * Write a description of class AutomaticTeller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AutomaticTeller
{
    public int PIN;
    
    //constructor to accept initial value for pin
    public AutomaticTeller(int PIN){
        this.PIN = PIN;
    }
    public void validateUser(){
        //creating scanner object for the user to enter pin number
        Scanner in = new Scanner(System.in);
        int pin;
        System.out.println("Enter PIN here:");
        pin = in.nextInt();//1st time asking for pin
        
        //if statements to ask for pin number three times, and then lock card after third attempt
        if (pin ==this.PIN){
            System.out.println("Your PIN is correct");//result if correct
        }else{
            System.out.println("Your PIN in incorrect. Please try again");//result if incorrect
            pin = in.nextInt();//second time asking for pin
            if (pin == this.PIN){
                System.out.println("Your PIN is correct");//result if correct
            }else{
                System.out.println("Your PIN in incorrect. Please try again");//result if incorrect
                pin = in.nextInt();//third time asking for pin
                if (pin == this.PIN){
                System.out.println("Your PIN is correct");//result if correct
            }else{
                System.out.println("Your card is blocked.");//result if incorrect
            }
            
        }
    }
        
    }
}
