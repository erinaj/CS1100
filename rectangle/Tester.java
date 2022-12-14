
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String args[]){
        //Here we will test the class we define today
        
        DataTypes dt = new DataTypes();
        System.out.println(dt);
        System.out.println(dt.getbValue());
        
        DataTypes dt1 = new DataTypes(false);
        System.out.println(dt1);
        System.out.println(dt1.getbValue());
        
        DataTypes dt2 = new DataTypes(10.5, 'G');
        System.out.println(dt2);
        System.out.println(dt2.getbValue());
        
        
    
    }
}


