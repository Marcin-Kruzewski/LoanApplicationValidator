package pl.edu.pjatk.poj.LoanVerificator;


public class IbanValidator {
	private IBANCheckDigit ibanChecker = new IBANCheckDigit;
	
	public static boolean isBANValid(String BAN){
		try{
			return ibanChecker.isValid(BAN);
		}catch(CheckDigitException exc){
			return false;
		}
	}
}
