package pl.edu.pjatk.poj.LoanVerificator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        
        application.setSurname("Kru�ewski");
        
        
        try{
            application.setPesel(new Pesel("92063008891"));
        }catch(NullPointerException exc){
            System.out.println("Pesel nie mo�e by� pusty.");
        }catch(LengthException exc){
            System.out.println("Pesel musi mie� dok�adnie 11 znak�w");
        }catch (TypeNotPresentException exc){
            System.out.println("pesel musi sk�ada� si� z cyfr");
        }
        
        
        try{
            application.setNip(new Nip("1234563218"));
        }catch(NullPointerException exc){
            System.out.println("Nip nie mo�e by� pusty.");
        }catch(LengthException exc){
            System.out.println("Nip musi mie� dok�adnie 10 znak�w");
        }catch (TypeNotPresentException exc){
            System.out.println("Nip musi sk�ada si� z cyfr");
        }
        
        
        try{
            application.setBankAccountNumber(new BankAccountNumber("11223344556677889900123456"));
        }catch(NullPointerException exc){
            System.out.println("Numer rachunku nie moze by� pusty.");
        }catch(LengthException exc){
            System.out.println("Numer rachunku musi mie� dok�adnie 26 znak�w");
        }catch (TypeNotPresentException exc){
            System.out.println("Numer rachunku musi sk�ada� si� z cyfr");
        }
        
        
        try {
            application.setDateOfBirdth(format.parse("1992-06-30"));
        }catch (ParseException exc){
            System.out.println("Podaj poprawn� dat� w formacie yyyy-mm-dd");
        }
        application.setGender(Gender.Male);
        
        //data validation
        if (application.isApplicationValid()) System.out.println("Dane s� poprawne");
    }
}
