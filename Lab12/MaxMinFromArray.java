import java.util.*;//importing for random class
/**
 * Write a description of class MaxMinFromArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaxMinFromArray
{
    int[] Array1D; //declaring Array variables
    int[][] Array2D;
    public MaxMinFromArray(){
        Array1D = new int[20]; //initializing variables to given values
        Array2D = new int[10][10];
        Random ranNum = new Random();//creating random object
        
        //filling arrays with random integers 1-100 using random class
        for (int i = 0; i < 20; i++){
            Array1D[i] = ranNum.nextInt(100);
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++)
            Array2D[i][j] = ranNum.nextInt(100);
        }
        }
    
    //method to get max from array 1
    public int getMaxFromArray1D(){
        int max = 0;
        for(int i = 0; i < 20; i++){
            if (Array1D[i] > max){
                max = Array1D[i];
            }
        }
        return max;
    }
    //method to get min from array 1
    public int getMinFromArray1D(){
        int min = 100;
        for(int i = 0; i < 20; i++){
            if (Array1D[i] < min){
                min = Array1D[i];
            }
        }
        return min;
    }
    //method to get max from array 2
    public int getMaxFromArray2D(){
        int max = 0;
        for (int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if (Array2D[i][j] > max){
                    max = Array2D[i][j];
                }
            }
        }
        return max;
    }
    //method to get min from array 2
    public int getMinFromArray2D(){
        int min = 100;
        for (int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if (Array2D[i][j] < min){
                    min = Array2D[i][j];
                }
            }
        }
        return min;
    }
}
