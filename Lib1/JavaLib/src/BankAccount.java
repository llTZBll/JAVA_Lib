public class BankAccount{
    int balance;

    protected BankAccount(){
        balance = 0;
    }

    protected  BankAccount(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public boolean withdraw(int amount){
        if(amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    public boolean deposit(int amount){
        if(amount <= 0) return false;
        balance += amount;
        return true;
    }
}