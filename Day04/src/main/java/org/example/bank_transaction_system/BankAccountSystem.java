package org.example.bank_transaction_system;

public class BankAccountSystem {
    public static void main(String[] args) {
        Account vinay=new Account(123,"Vinay Jadaun ",12);
        Account udit=new Account(345,"Udit Patel",1000000);

        try{
            vinay.withdrawal(15);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }


        try{
            udit.withdrawal(-100);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
