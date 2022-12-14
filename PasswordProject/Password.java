
/**
 * Write a description of class Password here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Password
{
    // instance variables - replace the example below with your own
    private String password;

    /**
     * Constructor for objects of class Password
     */
    public Password(String password)
    {
        // initialise instance variables
        this.password = password;
    }

    public boolean checkLength(){
        return (password.length() >=20 && password.length()<=100);
    }
    
    public boolean checkUnique(){
        int count = 0;
        int pointer = 0;
        while(pointer < password.length()){
            String currentCharacter = password.substring(pointer,pointer+1);
            String previousString = password.substring(0,pointer);
            //new string method: contains
            if(!previousString.contains(currentCharacter)) count ++;
        }
        
        return (count >= 5);
    }
    
    public boolean check3Types(){
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean numeric = false;
        String specialStr = "~!@#$%^*-_=+[{]}/;:,.?";
        boolean special = false;
        int pointer = 0;
        while(pointer < password.length()){
            char currentCharacter = password.charAt(pointer);
            String currentCharacter1 = password.substring(pointer,pointer+1);
            if(currentCharacter >='A' && currentCharacter <='Z') upperCase = true;
            if(currentCharacter >='a' && currentCharacter <='z') lowerCase = true;
            if(currentCharacter >='0' && currentCharacter <='9') numeric = true;
            if(specialStr.contains(currentCharacter1)) special = true;
            pointer ++;
        }
        int count = 0;
        if (upperCase) count++;
        if (lowerCase) count++;
        if (numeric) count++;
        if (special) count++;
        return (count >= 3);
    }
    
}
