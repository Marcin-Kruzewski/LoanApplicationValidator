package pl.edu.pjatk.poj.LoanVerificator;

import java.util.Date;

/**
 * Created by Marcin Krużewski on 3/5/2016.
 */
public class LoanApplication {
    private String firstName;
    private String surname;
    private Pesel pesel;
    private Nip nip;
    private BankAccountNumber bankAccountNumber;
    private Date dateOfBirdth;
    private Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Pesel getPesel() {
        return pesel;
    }

    public void setPesel(Pesel pesel) {
        this.pesel = pesel;
    }

    public Nip getNip() {
        return nip;
    }

    public void setNip(Nip nip) {
        this.nip = nip;
    }

    public BankAccountNumber getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(BankAccountNumber bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Date getDateOfBirdth() {
        return dateOfBirdth;
    }

    public void setDateOfBirdth(Date dateOfBirdth) {
        this.dateOfBirdth = dateOfBirdth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isNameValid(String Name){
        try {
            if (Name.length() > 1) return true;
        }catch (NullPointerException exc){}
        return false;
    }

    public boolean isNipValid() {
        try{
            return nip.isChechSumValid();
        }catch (NullPointerException exc){
            return false;
        }
    }

    public boolean isPeselValid(){
        try {
            return pesel.isCheckSumValid();
        }catch (NullPointerException exc) {
            return false;
        }
    }

    public boolean isBankAccountNumberValid() {
        return bankAccountNumber.isBankAccountNumberValid();
    }

    public boolean isDateOfBirdthValid(){
        //TODO: validation with pesel digits.
        return true;
    }
}
