interface WorldBank {
    void setBalance(double amount);

    double getBalance();

    default void interestRate() {
        System.out.println("Interest rate is 5%");
    }
}

interface RBI {
    void setBalance(double amount);

    double getBalance();

    void withdraw(double amount);

    void deposit(double amount);

    default void interestRate() {
        System.out.println("Interest rate is 7%");
    }
}

class HDFC implements WorldBank, RBI {
    private double balance;
    private double loanBalance;

    @Override
    public void setBalance(double amount) {
        this.balance = amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
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

    @Override
    public void interestRate() {
        RBI.super.interestRate();
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

class MultipleInheritance {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.setBalance(10000);
        System.out.println("The balance is: " + hdfc.getBalance());
        hdfc.deposit(2000);
        hdfc.withdraw(1000);
        System.out.println("The balance is: " + hdfc.getBalance());
        hdfc.interestRate();
        double amount = 2000;
        hdfc.giveLoan(amount);
        hdfc.takeLoan();
    }
}