package pl.edu.pjatk.poj.LoanVerificator;


import org.apache.commons.validator.routines.checkdigit.IBANCheckDigit;

public class IbanValidator {
    private static IBANCheckDigit ibanChecker = new IBANCheckDigit();

    public static boolean isBANValid(String BAN){return ibanChecker.isValid(BAN);}
}
