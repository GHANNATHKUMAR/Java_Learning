import java.util.Scanner;
//•	Create a class BankAccount with data members:
//o	accountNumber (int)
//o	balance (double)
//o	ownerId (int)
//•	Define methods:
//o	deposit(double amount)
//o	withdraw(double amount) (check for insufficient balance)
//o	transfer(BankAccount target, double amount) (transfer money from one account to another).
//•	In main(), create an array of 5 BankAccount objects, initialize them with different values, and then:
//1.	Deposit money into one account.
//2.	Withdraw from another account.
//3.	Transfer money between two accounts.
//4.	Print updated balances of all accounts

class Bankaccount {
    int accountNumber;
    double balance;
    int ownerId;

    // constructor
    Bankaccount(int accountNumber, int balance, int ownerId) {
        this.accountNumber = accountNumber;
        this.ownerId = ownerId;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("In your account " + amount + "has been deposited to " + accountNumber + " account number ");
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount by you must be positive");
        } else if (amount > balance) {
            System.out.println("Insufficient balance in your account ");
        } else {
            balance = balance - amount;
            System.out.println("your withdrawn amount is " + amount + " from your account number " + accountNumber + "and now your remaining balance is " + balance);
        }
    }

    void transfer(Bankaccount target, double amount) {
        if (amount <= 0) {
            System.out.println("Money cannot be transferred pleasen transfer positve money");
        } else if (amount > balance) {
            System.out.println("insufficient money which you want to transfer in your bank account " + accountNumber);
        } else {
            this.balance = this.balance - amount;
            target.balance = target.balance + amount;
            System.out.println("in this Account number " + target.accountNumber + " -> amount " + amount + "has been transferred from the account number" + accountNumber);
        }
    }

    void printDetails() {
        System.out.println("Account no:" + accountNumber + " and owner id " + ownerId + " and balance is " + balance);
    }
}

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bankaccount[] accounts = new Bankaccount[5];
        accounts[0] = new Bankaccount(1000, 8000, 1);
        accounts[1] = new Bankaccount(2000, 7000, 2);

        accounts[2] = new Bankaccount(3000, 6000, 3);
        accounts[3] = new Bankaccount(4000, 50000, 4);
        accounts[4] = new Bankaccount(5000, 51000, 5);
        System.out.println("TRansactions :");
        accounts[0].deposit(2000);
        accounts[1].withdraw(200);
        accounts[3].transfer(accounts[4], 2500);
        System.out.println("updated account details of account holder");
        for (Bankaccount acc : accounts) {
            acc.printDetails();
        }

    }
}
