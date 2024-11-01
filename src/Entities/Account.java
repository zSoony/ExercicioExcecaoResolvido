package Entities;

import Model.outOfLimitException;

public class Account {

    private Integer AccountNumber;
    private String HolderName;
    private Double Balance = 0.0;
    private Double WithdrawLimit;

    public Account(Integer accountNumber, String holderName, Double withdrawLimit) {
        AccountNumber = accountNumber;
        HolderName = holderName;
        WithdrawLimit = withdrawLimit;
    }

    public Account() {

    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String holderName) {
        HolderName = holderName;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }

    public Double getWithdrawLimit() {
        return WithdrawLimit;
    }

    public Double Deposit(double depositAmount) {
        return Balance += depositAmount;

    }

    public double Withdraw(double withdrawAmount) {

        if (withdrawAmount > Balance) {
            throw new outOfLimitException("Insuficient Balance");

        }

        if (withdrawAmount > WithdrawLimit) {
            throw new outOfLimitException("the requested amount exceeds the imposed limit. ");
        }

        return Balance -= withdrawAmount;
    }

    public String toString() {
        return "Account created "
                + ", account number:  "
                + getAccountNumber()
                + ", Holder name:  "
                + getHolderName()
                + ", Withdral limit of:  "
                + getWithdrawLimit();

    }

}
