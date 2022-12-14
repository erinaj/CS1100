import java.util.Scanner; //imports scanner class
/**
 * Write a description of class Lab09Tester here.
 *
 * @author (Erin Jones
 * @version 10/29
 */
public class Lab09Tester
{
    public static void main (String[] args){
        //TASK 1
        //creating object
        ValueAnalyzer valAn = new ValueAnalyzer(0);
        System.out.println("Task 1:");
        valAn.setValue(4); //testing with postive value (expected value is positive)
        /*if statement that prints positive for when value as 1,
         zero for 0, and negative for -1 */
        if (valAn.analyzeValue() == 1){
            System.out.println("The value of "+valAn.getValue()+" is positive");
        }else if (valAn.analyzeValue() == 0){
            System.out.println("The value of "+valAn.getValue()+" is zero");
        }else {
            System.out.println("The value of "+valAn.getValue()+" is negative");
        }
        valAn.setValue(0); //testing with value of 0 (expected value is zero)
        if (valAn.analyzeValue() == 1){
            System.out.println("The value of "+valAn.getValue()+" is positive");
        }else if (valAn.analyzeValue() == 0){
            System.out.println("The value of "+valAn.getValue()+" is zero");
        }else {
            System.out.println("The value of "+valAn.getValue()+" is negative");
        }
        valAn.setValue(-7); //testing with negaitve value (expected value is negative)
        if (valAn.analyzeValue() == 1){
            System.out.println("The value of "+valAn.getValue()+" is positive");
        }else if (valAn.analyzeValue() == 0){
            System.out.println("The value of "+valAn.getValue()+" is zero");
        }else {
            System.out.println("The value of "+valAn.getValue()+" is negative");
        }
        
        
        //TASK 2
        System.out.println();//skip line
        System.out.println("Task 2:");
        //creating object
        DoubleAnalyzer doubAn = new DoubleAnalyzer(0);
        //testing various values
        doubAn.setValue(1000001); //testing positive and large 
        doubAn.analyzeDouble();
        doubAn.setValue(-5); //testing negative
        doubAn.analyzeDouble();
        System.out.println();//skip line
        doubAn.setValue(-0.1);//testing negative and small
        doubAn.analyzeDouble();
        doubAn.setValue(87);//testing positive
        doubAn.analyzeDouble();
        System.out.println();//skip line
        doubAn.setValue(0);//testing zero and small
        doubAn.analyzeDouble();
        
        //TASK 3
        System.out.println();//skip line
        System.out.println("Task 3:");
        //creating object
        DigitPrinter digPrint = new DigitPrinter(0); 
        //testing all 8 methods, including negative values
        digPrint.setValue(-4);
        digPrint.printDigits();
        digPrint.setValue(11);
        digPrint.printDigits();
        digPrint.setValue(-141);
        digPrint.printDigits();
        digPrint.setValue(4511);
        digPrint.printDigits();
        digPrint.setValue(-76849);
        digPrint.printDigits();
        digPrint.setValue(838461);
        digPrint.printDigits();
        digPrint.setValue(1182740);
        digPrint.printDigits();
        digPrint.setValue(-91519465);
        digPrint.printDigits();
        
        //TASK 4
        System.out.println();//skip line
        System.out.println("Task 4:");
        //creating object
        DigitalThermometer thermom = new DigitalThermometer(0); 
        //testing with values
        thermom.setValue(16);
        thermom.calculateTemp();
        thermom.setValue(13);
        thermom.calculateTemp();
        thermom.setValue(9);
        thermom.calculateTemp();
    }
    
    
}
