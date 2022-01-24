class RBI {
    protected double balance;

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
}

class HDFC extends RBI {
    private double balance;
    private double loanBalance;

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double amount) {
        this.balance = amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance <= amount) {
            System.out.println("Not having enough amount");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " Money has been withdrawed");
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " Money has been deposited");
    }

    public void giveLoan(double amount) {
        this.loanBalance = amount;
        this.balance += this.loanBalance;
        System.out.println(this.loanBalance + " is debited");
    }

    public void takeLoan() {
        if (this.balance < (this.loanBalance + (this.loanBalance * 0.1))) {
            System.out.println("Please deposit required amount in the bank");
            return;
        }
        this.balance -= this.loanBalance + this.loanBalance * 0.1;
        System.out.println((this.loanBalance + (this.loanBalance * 0.1)) + " is credited");
    }
}

class ICICI extends RBI {
    private double balance;
    private double loanBalance;
    private double cryptoBalance;

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double amount) {
        this.balance = amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance <= amount) {
            System.out.println("Not having enough amount");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " Money has been withdrawed");
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " Money has been deposited");
    }

    public void giveLoan(double amount) {
        this.loanBalance = amount;
        this.balance += this.loanBalance;
        System.out.println(this.loanBalance + " is debited");
    }

    public void takeLoan() {
        if (this.balance < (this.loanBalance + (this.loanBalance * 0.09))) {
            System.out.println("Please deposit required amount in the bank");
            return;
        }
        this.balance -= this.loanBalance + this.loanBalance * 0.09;
        System.out.println((this.loanBalance + (this.loanBalance * 0.09)) + " is credited");
    }

    // added crypto support

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

class MultiLevel {
    public static void main(String[] args) {
        // HDFC

        // HDFC hdfc = new HDFC();
        // hdfc.setBalance(10000);
        // System.out.println("The balance is: " + hdfc.getBalance());
        // hdfc.deposit(2000);
        // hdfc.withdraw(1000);
        // System.out.println("The balance is: " + hdfc.getBalance());
        // double amount = 2000;
        // hdfc.giveLoan(amount);
        // hdfc.takeLoan();

        //ICICI

        ICICI icici = new ICICI();
        icici.setBalance(10000);
        System.out.println("The balance is: " + icici.getBalance());
        icici.deposit(2000);
        icici.withdraw(1000);
        System.out.println("The balance is: " + icici.getBalance());
        double amount = 2000;
        icici.giveLoan(amount);
        icici.takeLoan();

        System.out.println();

        icici.setCryptoBalance(10000);
        System.out.println("The crypto balance is: " + icici.getCryptoBalance());
        icici.depositCrypto(2000);
        icici.withdrawCrypto(1000);
        System.out.println("The crypto balance is: " + icici.getCryptoBalance());

    }
}
