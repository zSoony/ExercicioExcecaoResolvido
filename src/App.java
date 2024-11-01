import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Model.insuficientBalanceException;
import Model.outOfLimitException;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter you accont details. ");
            System.out.println("Account number: ");
            Integer accountNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the account holder name: ");
            String holderName = sc.nextLine();

            System.out.println("set a limit for withdrawals: ");
            double withdrawLimit = sc.nextDouble();

            Account Account1 = new Account(accountNumber, holderName, withdrawLimit);

            System.out.println(Account1.toString());

            System.out.println("Enter the amount for the first deposit: ");

            double depositAmount = sc.nextDouble();

            Account1.Deposit(depositAmount);
            System.out.println("New account balance " + Account1.getBalance());

            System.out.println("Enter the amount for the withdraw: ");
            double withdrawAmount = sc.nextDouble();
            Account1.Withdraw(withdrawAmount);

            System.out.println("New account balance: " + Account1.getBalance());

        } catch (outOfLimitException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Character not suported. ");
        } catch (insuficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
