import java.util.Random;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    public static void main(String[] args){
        Random generator = new Random();
        int count = 0;
        int totalC = 0;
        while (true) {
            int randomInt = generator.nextInt(10);
            System.out.println(randomInt);
            totalC++;
            if (randomInt == 5){
                count++;
                if (count == 20){
                    break;
                }
            }
        }
        System.out.println("The total count is "+totalC);
    }
}
