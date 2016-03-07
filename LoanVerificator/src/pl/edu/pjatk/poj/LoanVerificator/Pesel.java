package pl.edu.pjatk.poj.LoanVerificator;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * Created by Marcin Krużewski on 3/6/2016.
 */
public class Pesel {
    private int[] peselNums = new int[11];

    public int[] getPeselNums() {
        return peselNums;
    }

    public Pesel(String pesel) {
        if (pesel.length() == 11) {
            for (int i = 0; i < 11; i++) {
                peselNums[i] = Character.getNumericValue(pesel.charAt(i));
            }
        }else{
            throw new LengthException();
        }
    }

    public boolean isCheckSumValid() {
        int checkSum = (peselNums[0] + 3 * peselNums[1] + 7 * peselNums[2]
                + 9 * peselNums[3] + peselNums[4] + 3 * peselNums[5]
                + 7 * peselNums[6] + 9 * peselNums[7] + peselNums[8]
                + 3 * peselNums[9] + peselNums[10]) % 10;
        return (checkSum == 0);
    }

    @Override
    public String toString() {
        return "Pesel{" +
                "peselNums=" + Arrays.toString(peselNums) +
                '}';
    }
}
