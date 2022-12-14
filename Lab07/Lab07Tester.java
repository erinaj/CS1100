import java.util.Scanner;// imports scanner class
/**
 * Write a description of class Lab07Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab07Tester
{
    public static void main(String[] args) {
       //task 1
        System.out.println("The tasks will now begin");
        System.out.println("Task 1:");
        //creating paper object
        Paper paper01 = new Paper(8.2,5.3);
        //testing methods created in Paper Class
        System.out.println("The width of the paper in inches is "+paper01.getWidthInInches());
        System.out.println("The height of the paper in inches is "+paper01.getHeightInInches());
        System.out.printf("The width of the paper in mm is %.2f",paper01.getWidthInMillimeters());
        System.out.println();//skip line
        System.out.printf("The height of the paper in mm is %.2f",paper01.getHeightInMillimeters());
        System.out.println();//skip line
        
      //task 2
      //create scanner
      System.out.println();//skip line
      System.out.println("Task 2:");
      Scanner myObj = new Scanner(System.in);
      int var1 = myObj.nextInt();
      int var2 = myObj.nextInt();
      //creating object with two variables entered in scanner
      NumberCalculator numCal = new NumberCalculator(var1,var2);
      //printing the accessor methods
      System.out.println("The sum is "+numCal.getSum());
      System.out.println("The difference is "+numCal.getDifference());
      System.out.println("The product is "+numCal.getProduct());
      System.out.println("The average is "+numCal.getAverage());
      System.out.println("The distance is "+numCal.getDistance());
      System.out.println("The maximum is "+numCal.getMaximum());
      System.out.println("The minimum is "+numCal.getMinimum());
      
      //task 3
      System.out.println();//skip line
      System.out.println("Task 3:");
      System.out.println("Enter gallons, miles/gallon, and price/gallon"); //prompting user
      double givenGal = myObj.nextDouble();
      double givenMpergal = myObj.nextDouble();
      double givenPrice = myObj.nextDouble();
      CarSimulator car01 = new CarSimulator(givenGal, givenMpergal, givenPrice);
      //printing methods declared in class
      System.out.printf("The cost per 100 miles is $%.2f",car01.getCostPer100Miles());
      System.out.println();//skip line
      System.out.println("The distance is "+car01.getDistance());
      
      //task 4
      System.out.println();//skip line
      System.out.println("Task 4:");
      System.out.println("Enter frequency (in MHz), Cmin, and Cmax"); //prompting user
      //prompting user for variables and creating TuningCircuit object
      double givenF = myObj.nextDouble();
      double givenCMin1 = myObj.nextDouble();
      double givenCMax1 = myObj.nextDouble();
      TuningCircuit circuit01 = new TuningCircuit(givenF, givenCMin1, givenCMax1);
      
      System.out.printf("The value of Fmin is %.2f",circuit01.getFMin());
      System.out.println(" hertz.");
      System.out.printf("The value of Fmax is %.2f",circuit01.getFMax());
      System.out.println(" hertz.");
      
      
      
    }
}
