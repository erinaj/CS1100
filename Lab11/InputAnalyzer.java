import java.util.Scanner;//imports scanner class
/**
 * Write a description of class InputAnalyzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputAnalyzer
{ 
    //part a 
    public void findSmallLarge(){
        System.out.println("Enter values here to determine largest and smallest integer.");
        System.out.println("Enter any letter to stop. ");
        Scanner in = new Scanner(System.in);
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        boolean finished = false;
        while (!finished){
            if (in.hasNextInt()){
                int input = in.nextInt();
                if(input > large) large = input;
                if(input < small) small = input;
            }else{
                finished = true;
            }
        }
        System.out.println("The largest one is " + large);
        System.out.println("The smallest one is " + small);
    }
    //part b 
    public void countEvenOdd(){
        System.out.println("Enter values here to determine number of even and odd.");
        System.out.println("Enter any letter to stop. ");
        Scanner in = new Scanner(System.in);
        int evenC = 0;
        int oddC = 0;
        int input;
        boolean finished = false;
        while (!finished){
            if (in.hasNextInt()){
                input = in.nextInt();
                if(input % 2 !=1){
                    evenC++;
                }else{
                    oddC++;
                }
            }else{
                finished = true;
            }
        }
        System.out.println("The number of even numbers is " + evenC);
        System.out.println("The number of odd numbers is " + oddC);
    }
    //part c 
    public void cumulativeTotal(){
        int sum = 0;
        System.out.println("Enter values here to determine cumulative total");
        System.out.println("Enter any letter to stop. ");
        Scanner in = new Scanner(System.in);
        boolean finished = false;
        while(in.hasNextInt())
        {
            sum = sum + in.nextInt();
            System.out.println(sum);
        }
        while(!in.hasNextInt()&&(!finished)){
            finished = true;
        }
    }
}
