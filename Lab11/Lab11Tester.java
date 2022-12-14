import java.util.Scanner;
/**
 * Write a description of class Lab11Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab11Tester
{
    public static void main (String args[]){
        //Task 1
        System.out.println("Task 1:");
        //creates object for LoopComputer
        LoopsComputer myLoop = new LoopsComputer(); 
        //calling each class and printing context:
        //part a
        System.out.print("The sum of all even numbers between 0-100 is ");
        myLoop.computeEvenSum();
        //part b
        System.out.print("The sum of all squares between 0-100 is ");
        myLoop.computeSquareSum();
        //part c
        System.out.println("The powers of 2 from 2^0 to 2^20 are");
        myLoop.printPowers();
        //part d
        System.out.print("The sum of all odd numbers between a and b is ");
        myLoop.oddSum(1,9);
        System.out.println();//skip line
        
        //Task 2
        System.out.println("Task 2:");
        InputAnalyzer myInput = new InputAnalyzer();
        //part a
        myInput.findSmallLarge();
        System.out.println();//skip line
        //part b
        myInput.countEvenOdd();
        System.out.println();//skip line
        //part c
        myInput.cumulativeTotal();
        System.out.println();

        //Task 3
        System.out.println("Task 3:");
        System.out.println("Enter a String type here: ");
        Scanner in = new Scanner(System.in);//creating scanner
        StringManipulator manObj = new StringManipulator("Hello World");//creating object
        if (in.hasNextLine()){
            manObj.line = (in.nextLine());
        }
        //testing parts a-e
        System.out.println("The Upper Case Letter(s) are ");
        manObj.printUpper();
        System.out.println("Every other letter is: ");
        manObj.printEveryOther();
        System.out.println("The vowels to underscores are");
        manObj.vowelsToUnderscore();
        System.out.print("The number of vowels is ");
        manObj.printVowelCount();
        System.out.println("The vowel positions are");
        manObj.printVowelPositions();
    }
}
