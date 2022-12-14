
/**
 * Creating accessor and mutator methods to store and manipulate data including an employee's name, job title,
 * salary, and number of sick days.
 *
 * Erin Jones HPY346
 * 9/21/22
 */
public class Employee
{
    //declaring instance variables
    private String name;
    private String jobTitle;
    private double salary;
    private int sickDays;
    
    //adding constructor that accepts new student with initial values of 0
    public void NewEmployee(String givenName, String title){
        name = givenName; //name of employee
        jobTitle = title; //job title
        salary = 80000; //salary
        sickDays = 10; //number of sick days
    }
    
    //creating methods to get and return variables created above 
    public String getGivenName(){
        return name;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double getSalary(){
        return salary;
    }
    public int getSickDays(){
        return sickDays;
    }
    
    //creating methods to increase/decrease salary by percent, using new variable "percent"
    public void increaseSalary(double percent){
        salary = salary + (percent / 100 * salary); 
    }
    public void decreaseSalary(double percent){
        salary = salary - (percent / 100 * salary);
    }
    
    //methods to add/remove sick days 
    public void addSickDay(){
        sickDays = sickDays + 1;
    }
    public void removeSickDay(){
        sickDays = sickDays - 1;
    }
    
    //creating method to change job title
    public void changeJobTitle(String newTitle){
        jobTitle = newTitle;
    }
}
