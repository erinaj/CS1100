import java.util.Random;

/**
 * Write a description of class RandomTester2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester2
{
    public static void main(String[] args){
        Random generator = new Random();
        int NinS = 0;
        int NinC = 0;
        double x = 0;
        double y = 0;
        int count = 0;
        while ( count < 10000000){
            x = generator.nextDouble()*2-1;
            y = generator.nextDouble()*2-1;
            NinS++;
            if (Math.sqrt(x*x+y*y)<=1) NinC++;
            count++;
        }
        System.out.println("PI = "+NinC*4.0/NinS);
    }
}

