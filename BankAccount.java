
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class BankAccount implements Comparable<BankAccount> {
    private int accountNo;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method to reduce balance by given amount
    public void balanceChange(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Override toString method
    @Override
    public String toString() {
        return accountNo + "-" + holderName + "-" + balance;
    }

    // Implement Comparable interface to compare by holderName
    @Override
    public int compareTo(BankAccount other) {
        return this.holderName.compareTo(other.holderName);
    }
    public static void main(String[] args) {
        // Create objects
        BankAccount a1 = new BankAccount(1, "John", 1000.0);
        BankAccount a2 = new BankAccount(2, "Alice", 1500.0);
        BankAccount a3 = new BankAccount(3, "Bob", 1200.0);
        BankAccount a4 = new BankAccount(4, "Charlie", 800.0);

        // Create ArrayList and add objects
        ArrayList<BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        // Sort by holderName
        Collections.sort(myAccounts);

        // Reduce balances by 500 and print sorted objects
        Iterator<BankAccount> iterator = myAccounts.iterator();
        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            account.balanceChange(500.0);
            System.out.println(account.toString());
        }
    }
}