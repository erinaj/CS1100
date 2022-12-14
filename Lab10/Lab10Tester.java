
/**
 * Write a description of class Lab10Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab10Tester
{
    public static void main(String[] args){
        //TASK 1
        System.out.println("Task 1:");
        System.out.println("Taxes for:");
        //tests for single
        TaxReturn single1 = new TaxReturn(5000, TaxReturn.FilingStatus.SINGLE);
        System.out.println("Single person with an income of 5,000 = "+single1.getTax());
        System.out.println("Expected: 500");
        TaxReturn single2 = new TaxReturn(20000, TaxReturn.FilingStatus.SINGLE);
        System.out.println("Single person with an income of 20,000 = "+single2.getTax());
        System.out.println("Expected: 2600");
        TaxReturn single3 = new TaxReturn(50000, TaxReturn.FilingStatus.SINGLE);
        System.out.println("Single person with an income of 50,000 = "+single3.getTax());
        System.out.println("Expected: 8900");
        //tests for married 
        TaxReturn married1 = new TaxReturn(10000, TaxReturn.FilingStatus.MARRIED);
        System.out.println("Married couple with an income of 10,000 = "+married1.getTax());
        System.out.println("Expected: 1000");
        TaxReturn married2 = new TaxReturn(50000, TaxReturn.FilingStatus.MARRIED);
        System.out.println("Married couple with an income of 50,000 = "+married2.getTax());
        System.out.println("Expected: 6700");
        TaxReturn married3 = new TaxReturn(80000, TaxReturn.FilingStatus.MARRIED);
        System.out.println("Married couple with an income of 80,000 = "+married3.getTax());
        System.out.println("Expected: 12800");
        System.out.println();//skip line
        
        //TASK 2
        System.out.println("Task 2:");
        AutomaticTeller ATM = new AutomaticTeller(2702);//creating ATM object
        ATM.validateUser();
        System.out.println();//skip line

        //TASK 3
        System.out.println("Task 3:");
        CarSimulator car = new CarSimulator(); //creating car object
        System.out.println(car.checkDoors(1,1,0,1,1,1,1,1,CarSimulator.GearShift.P));
        System.out.println("Expected: Both doors open");
        System.out.println();//skip line
        System.out.println(car.checkDoors(0,1,1,0,0,0,1,0,CarSimulator.GearShift.P));
        System.out.println("Expected: Both doors locked");
        System.out.println();//skip line
        System.out.println(car.checkDoors(1,0,1,1,0,0,0,0,CarSimulator.GearShift.P));
        System.out.println("Expected: Left door open");
        System.out.println();//skip line
        System.out.println(car.checkDoors(1,1,0,1,1,1,1,1,CarSimulator.GearShift.N));
        System.out.println("Expected: Both doors locked");
        System.out.println();//skip line
        System.out.println(car.checkDoors(0,0,1,1,0,0,0,1,CarSimulator.GearShift.P));
        System.out.println("Expected: Right door open");
    }
}
