
/**
 * Write a description of class StringManipulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringManipulator
{
    String line;
    public StringManipulator(String line){
        this.line = line;
    }
    //part a
    public void printUpper(){
        for(int i = 0; i < line.length(); i++)
        {
            if(Character.isUpperCase(line.charAt(i)))
            { 
                System.out.println(line.charAt(i));
            }
        }
    }
    //part b
    public void printEveryOther(){
        for(int i = 0; i < line.length(); i+=2){
            System.out.println(line.charAt(i));
        }   
    }
    //part c
    public void vowelsToUnderscore(){
        String vowel = line;
        for(int i= 0; i< line.length()-1; i++){
            char v = vowel.charAt(i);
            if(v =='a'||v =='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U'){
                vowel = vowel.substring(0,i) + '_' + vowel.substring(i + 1);
            }
        }
        System.out.println(vowel);
    }
    //part d
    public void printVowelCount(){
        String vowel = line;
        int count = 0;
        for(int i = 0; i<line.length(); i++){
            char v = vowel.charAt(i);
            if(v =='a'||v =='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
    //part e
    public void printVowelPositions(){
        String vowel = line;
        int count = 0;
        for(int i = 0; i<line.length(); i++){
            char v = vowel.charAt(i);
            if(v =='a'||v =='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U'){
                System.out.println(i);
            }
        }
    }
}
