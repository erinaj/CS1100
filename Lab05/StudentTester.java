
/** StudentTester: testing methods created in the Student class
 * Erin Jones HPY346
 * 9/21/22
 */
public class StudentTester
{
    public static void main(String[] args){
        //creating a student object: student01 
        Student student01 = new Student();
        student01.NewStudent("John");
        //printing expected values for initial variables
        System.out.println("Student Information:"); //titling terminal window
        System.out.println("Expected Name: John");
        System.out.println("Expected Number of Quizzes: 0");
        System.out.println("Expected Total Score: 0");
        
        //testing by printing results returned by methods (actual results)
        System.out.println("Student Name: "+student01.getName());
        System.out.println("Number of Quizzes: "+student01.getNumQuiz());
        System.out.println("Total Score: "+student01.getTotalScore());
        
        //adding quiz scores 
        student01.addQuiz(90);
        student01.addQuiz(80);
        student01.addQuiz(95);
        student01.addQuiz(85);
        student01.addQuiz(100);
        
        //printing expected values for the new information added above
        System.out.println(); //skipping line
        System.out.println("Expected Name: John");
        System.out.println("Expected Number of Quizzes: 5");
        System.out.println("Expected Total Score: 450");
        
        //testing by printing results returned by methods (actual results) to see if they match
        System.out.println("Student Name: "+student01.getName());
        System.out.println("Number of Quizzes: "+student01.getNumQuiz());
        System.out.println("Total Score: "+student01.getTotalScore());
        
        
        //printing expected average score
        System.out.println(); //skipping line
        System.out.println("The expected average score is: 90"); 
        //printing the actual average score (returned by method)
        System.out.println("The average score is: "+student01.getAverageScore());
        
    }
}
