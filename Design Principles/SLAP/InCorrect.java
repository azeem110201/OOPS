class Bank{
    private double balance;
    private double cryptoBalance;

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) {
        if (this.balance <= amount) {
            System.out.println("Not having enough amount");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " Money has been withdrawed");
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " Money has been deposited");
    }

    public double getCryptoBalance() {
        return this.cryptoBalance;
    }

    public void setCryptoBalance(double amount) {
        this.cryptoBalance = amount;
    }

    public void withdrawCrypto(double amount) {
        if (this.cryptoBalance <= amount) {
            System.out.println("Not having enough amount");
            return;
        }
        this.cryptoBalance -= amount;
        System.out.println(amount + " Crypto Money has been withdrawed");
    }

    public void depositCrypto(double amount) {
        this.cryptoBalance += amount;
        System.out.println(amount + " Crypto Money has been deposited");
    }
}

class InCorrect {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(10000);
        bank.getBalance();
        bank.withdraw(2000);
        bank.deposit(5000);
        
        bank.setCryptoBalance(5);
        bank.getCryptoBalance();
        bank.withdrawCrypto(2);
        bank.depositCrypto(3);
    }
}
