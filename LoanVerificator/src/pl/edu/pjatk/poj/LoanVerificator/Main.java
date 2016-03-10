package pl.edu.pjatk.poj.LoanVerificator;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Marcin Kruzewski on 3/5/2016.
 */
public class Main {
    public static void main(String[] args){
        
    	
    	//Input date format
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //
        
        
        LoanApplication application = new LoanApplication();
        
        //data setting
        
        application.setFirstName("Marcin");
        
        application.setSurname("Krużewski");
        
        
        try{
            application.setPesel(new Pesel("92063008891"));
        }catch(NullPointerException exc){
            System.out.println("Pesel nie może być pusty.");
        }catch(LengthException exc){
            System.out.println("Pesel musi mieć dokładnie 11 znaków");
        }catch (TypeNotPresentException exc){
            System.out.println("pesel musi składać się z cyfr");
        }
        
        
        try{
            application.setNip(new Nip("1234563218"));
        }catch(NullPointerException exc){
            System.out.println("Nip nie może być pusty.");
        }catch(LengthException exc){
            System.out.println("Nip musi mieć dokładnie 10 znaków");
        }catch (TypeNotPresentException exc){
            System.out.println("Nip musi składa się z cyfr");
        }
        
        
        try{
            application.setBankAccountNumber(new BankAccountNumber("05120716189925878765941249"));
        }catch(NullPointerException exc){
            System.out.println("Numer rachunku nie moze być pusty.");
        }catch(LengthException exc){
            System.out.println("Numer rachunku musi mieć dokładnie 26 znaków");
        }catch (TypeNotPresentException exc){
            System.out.println("Numer rachunku musi składać się z cyfr");
        }
        
        
        try {
            application.setDateOfBirdth(format.parse("1992-06-30"));
        }catch (ParseException exc){
            System.out.println("Podaj poprawną datę w formacie yyyy-mm-dd");
        }
        application.setGender(Gender.Male);
        
        //data validation
        if (application.isApplicationValid()) System.out.println("Dane są poprawne");
    }
}
