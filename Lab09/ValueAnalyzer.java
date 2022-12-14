
/**
 * Write a description of class ValueAnalyzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ValueAnalyzer
{
    private int i;
    
    //constructor to accept values
    public ValueAnalyzer(int givenInt){
        i = givenInt;   
    }
    //mutator method
    public void setValue(int newInt){
      this.i = newInt;
    }
    //accesor method
    public int getValue(){
        return i;
    }
    //method that returns 0,-1,1 based on value of given int
    public int analyzeValue(){
         if (i > 0){
            return 1;
        }else if (i == 0){
            return 0;
        }else {
            return -1;
        }
        
    }
}
