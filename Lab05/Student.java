
/**
 * Creating accessor and mutator methods to store and manipulate data including a student's name,
 * total quiz score, number of quizes, and average score.
 *
 * Erin Jones HPY346
 * 9/21/22
 */

public class Student {

private String studentName; //name of student
private double totalScore; //score of all quizzes
private int numQuiz; //total number of quizzes
private double averageScore; //average of all quiz scores 

//adding constructor that accepts new student with initial values of 0
public void NewStudent(String name){
        studentName = name; 
        totalScore = 0;
        numQuiz = 0;
    }
//creating methods 
//method for getting the Student Name
public String getName(){
    return studentName;
}
//method for adding a new quiz (adds 1 to number of quizzes and new score to total score)
public void addQuiz(double score){
    numQuiz = numQuiz + 1;
    totalScore = score + totalScore;
}
//method for getting the total score
public double getTotalScore(){
    return totalScore;
}
//method for getting average score
public double getAverageScore(){
    averageScore = totalScore / numQuiz; //calculates average score 
    return averageScore;
}
//method to get number of quizzes
public int getNumQuiz(){
    return numQuiz;
}
}



