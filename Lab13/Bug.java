
/**
 * Write a description of class Bug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bug
{
    private int position;
    private int direction = 1;
    public Bug(int position){
        this.position = position;
    }
    public void turn(){
        if(direction == 1){
           direction = -1;
        } else {
           direction = 1;
        }
    }
    public void move(){
        position = position + direction;

    }
    public int getPosition(){
    return position;
    }  
    }
