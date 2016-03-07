package pl.edu.pjatk.poj.LoanVerificator;

import java.text.SimpleDateFormat;
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
        if (Name.length() > 1) return true;
        else return false;
    }

    public boolean isNipValid() {
        return nip.isChechSumValid();
    }

    public boolean isPeselValid(){
        return pesel.isCheckSumValid();
    }

    public boolean isBankAccountNumberValid() {
        return bankAccountNumber.isBankAccountNumberValid();
    }

    public boolean isDateOfBirdthValid(){
        String datePeselFormat = new SimpleDateFormat("yyMMdd").format(dateOfBirdth);
        if (pesel.toString().startsWith(datePeselFormat))return true;
        else return false;
    }

    public boolean isGenderValid(){
        if ((gender == Gender.Male) && (pesel.getPeselNums()[9] % 2 == 1)) return true;
        if ((gender == Gender.Female) && (pesel.getPeselNums()[9] % 2 == 0)) return true;
        return false;
    }

    public boolean isApplicationValid(){
        if(isNameValid(firstName) && isNameValid(surname) && isPeselValid() &&
                isNipValid() && isBankAccountNumberValid() && isDateOfBirdthValid() &&
                isGenderValid()) return true;
        else return false;
    }
}
