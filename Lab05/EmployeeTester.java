
/** EmployeeTester: testing methods created in the Employee class
 * Erin Jones HPY346
 * 9/21/22
 */
public class EmployeeTester
//
{
    public static void main(String[] args){
        //creating an employee object: employee01
        Employee employee01 = new Employee();
        employee01.NewEmployee("Jack", "Comedian");
        
        //printing expected values for initial variables
        System.out.println("Employee Information:"); //titling terminal window
        System.out.println("Expected Name and Job: Jack and Comedian");
        System.out.println("Expected Salary: 80000");
        System.out.println("Expected Initial Sick Days: 10");
        
        //testing by printing results returned by methods (actual results)
        System.out.println("Actual Employee Name and Title: "+employee01.getGivenName()+" and "+employee01.getJobTitle());
        System.out.println("Actual Initial Salary: "+employee01.getSalary());
        System.out.println("Actual Inital Sick Days: "+employee01.getSickDays());
        
        //testing ADD sick day mutator method
        employee01.addSickDay(); //adding 3 sick days to make 13 total
        employee01.addSickDay();
        employee01.addSickDay();
        System.out.println();//skipping line
        System.out.println("The Expected New Sick Days is 13"); //printing expected sick days
        System.out.println("Actual New Sick Days: "+employee01.getSickDays()); //printing actual sick days
        //testing the REMOVE sick day method
        employee01.removeSickDay(); //removing 2 sick days to make 11 total
        employee01.removeSickDay();
        System.out.println("The Expected New Sick Days is 11"); //printing expected sick days
        System.out.println("Actual New Sick Days: "+employee01.getSickDays()); //printing actual sick days
        
        //testing increase salary methods
        employee01.increaseSalary(10); //increasing salary by 10%
        System.out.println();//skipping line
        System.out.println("The Expected New Salary is 88000.0");
        System.out.println("Actual New Salary: "+employee01.getSalary());
        //testing decrease salary methods
        employee01.decreaseSalary(50); //decreasing salary by 50%
        System.out.println();//skipping line
        System.out.println("The Expected New Salary is 44000.0");
        System.out.println("Actual New Salary: "+employee01.getSalary());

        //testing change job title method
        employee01.changeJobTitle("Bounty Hunter"); //setting job title to Bounty Hunter
        System.out.println();//skipping line
        System.out.println("The Expected New Job Title is Bounty Hunter");
        System.out.println("Actual New Title: "+employee01.getJobTitle());
        
    }
}
