package pl.edu.pjatk.poj.LoanVerificator;

/**
 * Created by Marcin Kruzewski on 3/6/2016.
 */
public class BankAccountNumber {
    private String IBANString;

    public BankAccountNumber(String ban){
        if (ban.startsWith("PL")) IBANString = ban;
        else IBANString = "PL" + ban;
    }

    public boolean isBankAccountNumberValid(){
    	return IbanValidator.isBANValid(this.toString());
    }

    @Override
    public String toString() {
        return IBANString;
    }
}
