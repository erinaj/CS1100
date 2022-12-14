
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    int fibo;
    //constructor for fibo value
    public Fibonacci(int fibo){
        this.fibo = fibo;
    }
    public long getFiboNumber(){
        long fold1 = 1; //initial value
        long fold2 = 1; //initial value
        long fnew = fold1 + fold2; //initially fnew is 3rd fibonocci number
        //loop performs calculation for fibonacci sequence
        for (int i = 3; i <= fibo; i++){ 
           fnew = fold1 + fold2;
           fold1 = fold2;
           fold2 = fnew;
        }
        return fnew; 
     }
}
