package org.example.bank_transaction_system;

//Account->It is a blueprint of BankAccount with behavior of withdrawal
public class Account {
    private int accountHolderId;
    private String accountHolderName;
    private double balance;

    Account(int accountHolderId,String accountHolderName,int balance){
        this.accountHolderId=accountHolderId;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    //method adds amount to balance
    public void withdrawal(double amount) throws InsufficientBalanceException,IllegalArgumentException{

        if(amount<0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        else if(amount>this.balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        else{
            this.balance=this.balance-amount;
            System.out.println("Withdrawal successful, new balance:"+this.balance);
        }
    }
    public int getAccountHolderId() {
        return accountHolderId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return ("AccountHolderId :"+this.accountHolderId+" /n AccountHolderName :"+this.accountHolderName+" /n Balance :"+this.balance);
    }
}
