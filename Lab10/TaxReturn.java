
/**
 * Write a description of class TaxReturn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TaxReturn
{
    //declaring enum type for filing status
    public static enum FilingStatus {
        SINGLE, MARRIED
    }
    double income;
    FilingStatus fs;

    //constructor to accept values for income and filing status
    public TaxReturn(double anIncome, FilingStatus fs) {
        income = anIncome;
        this.fs = fs;
    }
    //method to return amount of the tax
    public double getTax(){
    //code for single
        if (fs == FilingStatus.SINGLE){
        if (income > 0 && income < 8000){
            income = income * 0.1;
        }else if (income >= 8000 && income < 32000){
            income = ((income - 8000) * 0.15) + 800;
        }else {
            income = ((income - 32000) * 0.25) + 4400;
        }
    }
    //code for married
     if (fs == FilingStatus.MARRIED){
        if (income > 0 && income < 16000){
            income = income * 0.1;
        }else if (income >= 16000 && income < 64000){
            income = (income - 16000) * 0.15 + 1600;
        }else {
            income = (income - 64000) * 0.25 + 8800;
        }
        
    }
    return income;
}
}
