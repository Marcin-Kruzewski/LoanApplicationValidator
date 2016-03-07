package pl.edu.pjatk.poj.LoanVerificator;

import java.util.Arrays;

/**
 * Created by Marcin Krużewski on 3/6/2016.
 */
public class BankAccountNumber {
    private int[] banNums = new int[26];

    public int[] getBanNums() { return banNums; }

    public BankAccountNumber(String ban){
        if (ban.length() == 26) {
            for (int i = 0; i < 26; i++) {
                banNums[i] = Character.getNumericValue(ban.charAt(i));
            }
        }else{
            throw new LengthException();
        }
    }

    public boolean isBankAccountNumberValid(){
        return true;
    }

    @Override
    public String toString() {
        return "BankAccountNumber{" +
                "banNums=" + Arrays.toString(banNums) +
                '}';
    }
}
