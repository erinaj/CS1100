
/**
 * Write a description of class DataTypes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypes
{
    //Eight instance variables
    //Data
    private boolean bValue = true;
    //integer
    private byte biValue = (byte) 10;
    private short shortValue = (short) 100;
    private int intValue = 1000;
    private long longValue = 10000;
    //double
    private float floatNumber =(float) 0.1;
    private double doubleNumber = 10.1;
    //char
    private char charValue = 'A';
    
    
    
    
    //Methods- begin to define constructors
    //constructors 
    public DataTypes(){
        bValue = true;
        biValue = (byte) 10;
        shortValue = (short) 100;
        intValue = 1000;
        longValue = 10000;
        floatNumber =(float) 0.1;
        doubleNumber = 10.1;
        charValue = 'A';
    
        
    }
    
    public DataTypes(boolean bValue){
    
        this.bValue = bValue;
        biValue = (byte) 10;
        shortValue = (short) 100;
        intValue = 1000;
        longValue = 10000;
        floatNumber =(float) 0.1;
        doubleNumber = 10.1;
        charValue = 'A';

    } 
    
    public DataTypes(double givenDouble, char givenChar){
    
        this.bValue = bValue;
        biValue = (byte) 10;
        shortValue = (short) 100;
        intValue = 1000;
        longValue = 10000;
        floatNumber =(float) 0.1;
        doubleNumber = givenDouble;
        charValue = givenChar;

    
}

//getters
public boolean getbValue(){
    return bValue;
}

public double getdoubleNumber(){
    return doubleNumber;
}


public double getcharValue(){
    return charValue;
}

//setters
public void setbValue(boolean bValue){
    
    this.bValue = bValue;
}
}