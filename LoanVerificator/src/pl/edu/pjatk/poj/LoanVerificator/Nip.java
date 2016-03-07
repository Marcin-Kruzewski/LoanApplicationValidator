package pl.edu.pjatk.poj.LoanVerificator;

/**
 * Created by Marcin on 3/6/2016.
 */
public class Nip {
    private int[] nipNums = new int[10];

    public Nip(String nip) {
        if (nip.length() == 10) {
            for (int i = 0; i < 10; i++) {
                nipNums[i] = Character.getNumericValue(nip.charAt(i));
            }
        }else{
            throw new LengthException();
        }
    }

    public boolean isChechSumValid(){
        int checkSum = (6 * nipNums[0] + 5 * nipNums[1] + 7 * nipNums[2]
                + 2 * nipNums[3] + 3 * nipNums[4] + 4 * nipNums[5]
                + 5 * nipNums[6] + 6 * nipNums[7] + 7 * nipNums[8]) % 11;
        return (checkSum == nipNums[9]);
    }

    public int[] getNipNums() {
        return nipNums;
    }
}
