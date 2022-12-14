import java.util.Scanner;
/**
 * Write a description of class FibonacciTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciTester
{
    public static void main(String[] args){
        //prompting user for n value for fibonocci sequence
        Scanner in = new Scanner(System.in);
        ////making negative numbers and nonintegers invalid
        int n = 0;
        while(true){
            System.out.println("Enter n value");
            if(in.hasNextInt()){
                n = in.nextInt();
                if (n > 0){
                    break;
                }else{
                    System.out.println("Integer must be positive. Try again");
                    in.next();
                }
            }else{
                System.out.println("Must be whole number. Try again");
                in.next();
            }
        }
        
        //test for Fibonacci class
        Fibonacci fibo = new Fibonacci(n);//object for Fibonacci class
        System.out.println("Fibonacci number "+n+" is "+fibo.getFiboNumber());
        
        //test for MaxMinArray class
        MaxMinFromArray myObj = new MaxMinFromArray();
        System.out.println("The max value from Array 1 is "+myObj.getMaxFromArray1D());
        System.out.println("The min value from Array 1 is "+myObj.getMinFromArray1D());
        System.out.println("The max value from Array 2 is "+myObj.getMaxFromArray2D());
        System.out.println("The min value from Array 2 is "+myObj.getMinFromArray2D());
    }
}
