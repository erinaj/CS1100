import javax.swing.JOptionPane;
//Erin Jones
//HPY346
//DO THIS FOR EVERY ASSIGNMENT THIS SEMESTER!!! (worth 5 pts)
 public class HelloPrinter
{
    public static void main(String[] args) {//begin main
		//the following line of code prints a message to the screen
        System.out.println("It's a great day to have a great day!");
        System.out.println(1+2+3+4+5+6+7+8+9+10);
        System.out.println(1*2*3*4*5*6*7*8*9*10);
        System.out.println("");
        System.out.println("* * * * *   * * * * *");
        System.out.println("*               *");
        System.out.println("* * *           *");
        System.out.println("*           *   *");
        System.out.println("* * * * *   * * *");
        System.out.println("");
        System.out.println("Sales Tax Rates");
        System.out.println("-------------------");
        System.out.println("Arkansas:      9%");
        System.out.println("Lousianna:     8%");
        System.out.println("New Mexico:    7%");
        System.out.println("Tennessee:     6%");
        System.out.println("Oregon:        5%");
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("hello" + name);

        } //end main
}
