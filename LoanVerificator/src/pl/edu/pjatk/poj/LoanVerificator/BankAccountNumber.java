package pl.edu.pjatk.poj.LoanVerificator;

import java.util.Arrays;

/**
 * Created by Marcin Kruzewski on 3/6/2016.
 */
public class BankAccountNumber {
    private String IBANString;

    public BankAccountNumber(String ban){
        IBANString = "PL" + ban;
    }

    public boolean isBankAccountNumberValid(){
    	return IbanValidator.isBANValid(this.toString());
    }

    @Override
    public String toString() {
        return IBANString;
    }
}
