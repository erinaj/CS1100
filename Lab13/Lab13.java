import java.util.*; //imports random class
/**
 * @Erin Jones HPY346
 * @12/3/22
 */
public class Lab13
{
    public static void main (String[] args){
        Lab13 lab13 = new Lab13();//creates object for class
        
        //Task 1: printRectangle
        System.out.println("Printing rectangle with 3 rows and 4 columns:");
        lab13.printRectangle(3,4); //testing method
        System.out.println();//skip line
        
        //Task 2: printArray
        int[] primes = {2,3,5,7,11};//initializing prime array
        System.out.println("Printing the primes array:");
        lab13.printArray(primes);//testing method
        System.out.println();//skip line
        
        //Task 3: randomArray
        int[] randomArray = lab13.getRandomArray(10);//initilizing randomArray to size 10 and testing random method
        System.out.println("Printing the random array:");
        lab13.printArray(randomArray);//printing array previously initialized
        System.out.println();//skip line
        
        //Task 4: printEvens
        System.out.println("Printing the evens from the random array:");
        lab13.printEvens(randomArray);//testing method
    
    }
    
    //Task 1: creating printRectangle method
    public void printRectangle(int rows, int columns){
        String s = "*";
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++){
                System.out.print(s);//prints a "*" for every column
            }
            System.out.println();
            //skips to new line after columns are printed and repeats for each row
        }
    }
    //Task 2: creating printArray method
    public void printArray(int[] a){
        //loop that prints every value of a inside the array
        for(int i= 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    //Task 3: creating getRandomArray method
    public int[] getRandomArray(int size){
        int[] myArray = new int [size];//creating object to accept size of array 
        Random r = new Random();//creates random object
        //loop that fills array with random int until size is reached
        for(int i = 0; i < myArray.length; i++){
            //fills array with values 0-99 inclusive
            myArray[i] = r.nextInt(100); 
        }
        return myArray;
    }
    //Task 4: creating printEvens method
        public void printEvens(int[] a){
        int[] myArray1 = a;
        int count = 0;
        //loop that prints only even numbers from array and keeps count
        for(int i = 0; i < myArray1.length; i++){
            if(myArray1[i]  % 2 == 0){
                System.out.println(myArray1[i]);
                count++;
            }
        }
        System.out.println("Found "+count+" evens in input array.");//prints even count
    }
}
