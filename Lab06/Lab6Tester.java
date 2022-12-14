import java.util.Scanner;// imports scanner class
/**
 * Write a description of class Lab6Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab6Tester
{
    public static void main(String[] args) {
      //step 1 
      //creating and initializing 8 variables (priminitive data types) 
      byte bt = (byte)12;
      short s = (short)8;
      int i = (int)10;
      long l = (long)100;
      float f = (float)2.0;
      double dbl = (double)10.0;
      boolean bln = true;
      char ch = 'A';
        
     //printing the names and values of the variables declared above
     System.out.println("Step 1:");
     System.out.println("Variables and values");
     System.out.println("My byte variable bt is = "+bt);
     System.out.println("My short variable s is = "+s);
     System.out.println("My int variable i is = "+i);
     System.out.println("My long variable l is = "+l);
     System.out.println("My float variable f is = "+f);
     System.out.println("My double variable dbl is = "+dbl);
     System.out.println("My boolean variable bln is = "+bln);
     System.out.println("My char variable ch is = "+ch);
     //modifying variables
     bt = (byte)6;
     s = (short)3;
     i = (int)5;
     l = (long)50;
     f = (float)9.0;
     dbl = (double)3.0;
     bln = false;
     ch = 'B';
     //printing new variables
     System.out.println();//skip line
     System.out.println("New variables and values:");
     System.out.println("My new byte variable bt is = "+bt);
     System.out.println("My new short variable s is = "+s);
     System.out.println("My new int variable i is = "+i);
     System.out.println("My new long variable l is = "+l);
     System.out.println("My new float variable f is = "+f);
     System.out.println("My new double variable dbl is = "+dbl);
     System.out.println("My new boolean variable bln is = "+bln);
     System.out.println("My new char variable ch is = "+ch);
     
     //creating 8 constants 
     final byte bt1 = (byte)6;
     final short s1 = (short)9;
     final int i1 = (int)14;
     final long l1 = (long)21;
     final float f1 = (float)6.0;
     final double dbl1 = (double)8.0;
     final boolean bln1 = true;
     final char ch1 = 'C';
     //printing constants 
     System.out.println();//skip line
     System.out.println("Constants and values:");
     System.out.println("My byte constant bt1 is = "+bt1);
     System.out.println("My short constant s1 is = "+s1);
     System.out.println("My int constant i1 is = "+i1);
     System.out.println("My long constant l1 is = "+l1);
     System.out.println("My float constant f1 is = "+f1);
     System.out.println("My double constant dbl1 is = "+dbl1);
     System.out.println("My boolean constant bln1 is = "+bln1);
     System.out.println("My char constant ch1 is = "+ch1);
     //printing what happens if you try to assign a value to a constant.
     System.out.println("When you try to assign a value to a constant you get an error message.");
     System.out.println();//skip line
     
      //step 2
      int a = 3;
      int b = 4;
      int c = 5;
      int d = 17;
      System.out.println("Step 2:");
      // 3 and 4 are added with sum 7
      // 7 is divided by 5 with quotient 1
      System.out.println((a + b)/ c);
      // 4 is divided by 5 with quotient 0
      // 3 is added to 0 with sum 3
      System.out.println(a + b / c);
    // 1 is added to 3 using a++ for a total of 4
    a++;
      System.out.println(a);
    // 1 is subtracted from 4 using a-- for a total of 3
    a--;
      System.out.println(a);
    // 1 is added to 3 for a total of 4
      System.out.println(a + 1);
        // finding the remainder of 17/5 which is 2
      System.out.println(d % c);
        // 17 is divided by 5 for a quotient 3
      System.out.println(d / c);
        // finding the remainder of 17/4 which is 1
      System.out.println(d % b);
        // 17 is dividied by 4 for a quotient 4
      System.out.println(d / b);
        // 3 is divided by 17 for a quotient of 0
        // 17 is added to 4 for a total of 21
      System.out.println(d + a / d + b);
        // 17 is added to 3 for a sum of 20
        // 17 is added to 4 for a sum of 21
        // 20 is divided by 21 for a quotient 0
      System.out.println((d + a) / (d + b));
        // square root of 4 gives a total of 2.0
      System.out.println(Math.sqrt(b));
        // raises 3^4 for a total of 81.0
      System.out.println(Math.pow(a, b));
        // finds the absolute value of -3 for a value of 3
      System.out.println(Math.abs(-a));
        // finds the highest value out of 3 and 4 and prints a total of 4
      System.out.println(Math.max(a, b));
      
      //step 3 
      System.out.println();//skip line
      System.out.println("Step 3:");
      Scanner myObj = new Scanner(System.in);
      int var1 = myObj.nextInt();
      int var2 = myObj.nextInt();
      System.out.println("The smaller of the two numbers is "+Math.min(var1, var2));
      
      //step 4 
      System.out.println();//skip line
      System.out.println("Step 4:");
      double milk = 5.5; // gallons
      double jarCapacity = 0.75; // gallons
      int completelyFilledJars = (int)(milk / jarCapacity);
      System.out.println("Number of Filled Jars: " + completelyFilledJars);
      System.out.println("The code tried to assign a double to an int so I had to assign the value to int instead.");
      
      //step 5 
      //adding final to make the variables constants
      final double yards = 3.5;
      final double feet = yards * 3;
      final double inches = feet * 12;
      System.out.println();//skip line
      System.out.println("Step 5:");
      System.out.println(yards + " yards are " + feet + " feet"); //added spaces to make more readable
      System.out.println(yards + " yards are " + inches + " inches");
      
      //step 6
      int x = 10;
      int y = -3;
      //adding one to x and y using two different methods
      x = x+1; 
      y++;
      System.out.println(); //skip line
      System.out.println("Step 6:");
      System.out.println("The new value of x is "+x);
      System.out.println("The new value of y is "+y);
      
      //step 7
      int pmt = 10000; //periodic payment
      double d2 = 0.08; //periodic interest or compound rate; i 
      int n = 20; //number of payments
      double pvann = pmt * (((Math.pow(1+d2,n-1) -1) / d2) /Math.pow(1+d2,n-1) +1);
      System.out.println();//skip line
      System.out.println("Step 7:");
      System.out.println(pvann);
      //7.2
      System.out.println("Enter pmt, i, and n");
      pmt = myObj.nextInt();
      d2 = myObj.nextDouble();
      n = myObj.nextInt();
      double pvann2 = pmt * (((Math.pow(1+d2,n-1) -1) / d2) /Math.pow(1+d2,n-1) +1);
      System.out.println(pvann2);
    
      
      //step 8
      System.out.println(); //skip line
      System.out.println("Step 8:");
      int age1 = 18;
      int age2 = 35;
      int age3 = 50;
      int age4 = 44;

      double averageAge = (double)(age1 + age2 + age3 + age4) / 4; //8.2 adding double in front of the calculation fixes it
      System.out.println("average age: " + averageAge);
      //printing the output of the statement
      System.out.println("The output of the following code is 36.0 even though the correct answer is 36.75.");
      System.out.println("This is because the initial values are integer types and will not deal with decimals.");
      System.out.println("Instead, it will print the whole number below.");
      
      //step 9 
      System.out.println(); //skip line
      System.out.println("Step 9:");
      double probability = 8.70;
      int percentage = (int) (Math.round(100 * probability));
      System.out.println("The output is 869 because the computer outputs a decimal and does not know to round up to the correct number.");
      //printing the new value that is rounded with Math.round
      System.out.println(percentage);
      
      
      //step 10
      System.out.println(); //skip line
      System.out.println("Step 10:");
      String inputString = new String("The quick brown fox jumps over the lazy dog");
      //printing the characters one at a time in order to create phrase given
      String outputString = inputString.substring(0,1)+inputString.substring(2,3)+inputString.substring(22,24)+inputString.substring(5,6)+inputString.substring(24,25)+inputString.substring(3,4)+inputString.substring(16,17)+inputString.substring(21,22)+inputString.substring(42,43)+inputString.substring(6,7)+inputString.substring(31,32);
      System.out.println("The outputString is "+outputString);
      
      


      


      
    


    }
}

