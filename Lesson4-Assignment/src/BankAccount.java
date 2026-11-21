public class BankAccount {
    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Account Number Should be positive");
        }

        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException("Account Holder Should not be empty");
        }

        if (!Double.isFinite(balance) || balance <= 0) {
            throw new IllegalArgumentException("Balance should be positive");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException("Account Holder Should not be empty");
        }

        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Balance should be positive");
        }
      this.balance+= amount;
    }

       public void withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Balance should be positive");
        }
        if(this.balance < amount){
           throw new IllegalArgumentException("Amount Should be less than or equal to balance");
        }
      this.balance-= amount;
    }
}
