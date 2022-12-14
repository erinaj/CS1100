
/**
 * Write a description of class LoopsComputer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopsComputer
{
    //part a
    public void computeEvenSum(){
        int sum = 0;
        int a = 0;
        while (a <= 100){
            sum = sum + a;
            a++;
            a++;
        }
        System.out.println(sum);
    }
    //part b
    public void computeSquareSum(){
        int sum = 0;
        int a = 0;
        while (a <= 100){
            sum = sum + (int)Math.pow(a,2) ;
            a++;
        }
        System.out.println(sum);
    }
    //part c
    public void printPowers(){
        int sum = 0;
        int a = 0;
        while (a <= 20){
            sum = (int)Math.pow(2,a);
            System.out.println("2^"+a+" is "+sum);
            a++;
        }
    }
    //part d
    public void oddSum(int a, int b){
        int sum = 0;
        while (a<=b){
            if (a % 2 != 0){
                sum = sum + a;
            }
            a++;
        }
        System.out.println(sum);
    }
}
