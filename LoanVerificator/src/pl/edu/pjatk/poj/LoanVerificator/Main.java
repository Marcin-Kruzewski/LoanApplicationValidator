package pl.edu.pjatk.poj.LoanVerificator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Marcin on 3/5/2016.
 */
public class Main {
    public static void main(String[] args){
        //Dateformat
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //
        LoanApplication application = new LoanApplication();
        application.setFirstName("Marcin");
        application.setSurname("Krużewski");
        try{
            application.setPesel(new Pesel("92062008892"));
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
            System.out.println("Nip musi składać się z cyfr");
        }
        try{
            application.setBankAccountNumber(new BankAccountNumber("11223344556677889900123456"));
        }catch(NullPointerException exc){
            System.out.println("Numer rachunku nie może być pusty.");
        }catch(LengthException exc){
            System.out.println("Numer rachunku musi mieć dokładnie 26 znaków");
        }catch (TypeNotPresentException exc){
            System.out.println("Numer rachunku musi składać się z cyfr");
        }
        try {
            application.setDateOfBirdth(format.parse("1992-06-20"));
        }catch (ParseException exc){
            System.out.println("Podaj poprawną datę w formacie yyyy-mm-dd");
        }
        application.setGender(Gender.Male);

        if (application.isApplicationValid()) System.out.println("Dane są poprawne");

    }
}
