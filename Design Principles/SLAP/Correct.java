interface Transaction{
    public double withdraw(double balance, double amount);
    public double deposit(double balance, double amount);
}

//Above code is optional. If we want to add interface between the NormalTRansaction and the Bank.

class NormalTransaction implements Transaction{
    public double withdraw(double balance, double amount) {
        if (balance <= amount) {
            return balance;
        }
        balance -= amount;
        return balance;
    }

    public double deposit(double balance, double amount) {
        balance += amount;

        return balance;
    }
}

class CryptoTransaction implements Transaction{
    public double withdraw(double cryptoBalance, double amount) {
        if (cryptoBalance <= amount) {
            System.out.println("Not having enough amount");
            return cryptoBalance;
        }
        cryptoBalance -= amount;

        return cryptoBalance;
    }

    public double deposit(double cryptoBalance, double amount) {
        cryptoBalance += amount;

        return cryptoBalance;
    }
}

class Bank {
    private double balance;
    private double cryptoBalance;

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void withdraw(NormalTransaction nt, double amount) {
        // added Transaction component which is different then the Bank
        double balanceCheck = this.balance;
        this.balance = nt.withdraw(this.balance, amount);
        if (balanceCheck == this.balance) {
            System.out.println("Not having enough amount");
        } else {
            System.out.println(amount + " Money has been withdrawed");
        }
    }

    public void deposit(NormalTransaction nt, double amount) {
        // added Transaction component which is different then the Bank
        double balanceCheck = this.balance;
        this.balance = nt.deposit(this.balance, amount);
        if (balanceCheck == this.balance) {
            System.out.println("Money is not depoisted in the bank");
        } else {
            System.out.println(amount + " Money has been deposited");
        }
    }

    public double getCryptoBalance() {
        return this.cryptoBalance;
    }

    public void setCryptoBalance(double amount) {
        this.cryptoBalance = amount;
    }

    public void withdrawCrypto(CryptoTransaction ct,double amount) {
        // added CrytoTransaction component which is different then the Bank
        double balanceCheck = this.cryptoBalance;
        this.cryptoBalance = ct.withdraw(this.cryptoBalance, amount);
        if (balanceCheck == this.cryptoBalance) {
            System.out.println("Not having enough amount");
        } else {
            System.out.println(amount + " Crypto Money has been withdrawed");
        }
    }

    public void depositCrypto(CryptoTransaction ct, double amount) {
        // added CrytoTransaction component which is different then the Bank
        double balanceCheck = this.cryptoBalance;
        this.cryptoBalance = ct.deposit(this.cryptoBalance, amount);
        if (balanceCheck == this.cryptoBalance) {
            System.out.println("Crypto is not depoisted in the bank");
        } else {
            System.out.println(amount + " Cryto has been deposited");
        }
    }
}

class Correct {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(10000);
        System.out.println(bank.getBalance());

        NormalTransaction nt = new NormalTransaction();
        bank.withdraw(nt, 2000);
        bank.deposit(nt, 3000);
        System.out.println(bank.getBalance());


        bank.setCryptoBalance(10);
        System.out.println(bank.getCryptoBalance());
        bank.getCryptoBalance();

        CryptoTransaction ct = new CryptoTransaction();
        bank.withdrawCrypto(ct, 2);
        bank.depositCrypto(ct, 3);
        System.out.println(bank.getCryptoBalance());
    }
}
