public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

class Account {
    private String owner;
    private int balance;
    private int accountNumber;

    public Account(String owner, int balance, int accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("Not enough funds in the account to withdraw " + amount + ", please verify.");
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " executed successfully. New amount: " + balance);
    }
}

class Exercise3 {
    public static void main(String[] args) {
        Account account = new Account("Tomasz Jastrzębski", 1000, 123123);

        System.out.println("Initial value: " + account.getBalance());
        try {
            account.withdraw(500);
            account.withdraw(1500);
        } catch (NotEnoughMoneyException error) {
            System.out.println("An error during withdrawing occurred: " + error.getMessage());
            error.printStackTrace();
        } catch (Exception error) {
            System.out.println("An error occurred: " + error.getMessage());
        } finally {
            System.out.println("Final funds: " + account.getBalance());
        }
    }
}