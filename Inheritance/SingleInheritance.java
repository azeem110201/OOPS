class RBI {
    protected double balance;

    public double getBalance(){
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

class HDFC extends RBI{
    private double balance;
    private double loanBalance;

    @Override
    public double getBalance(){
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

    public void giveLoan(double amount){
        this.loanBalance = amount;
        this.balance += this.loanBalance;
        System.out.println(this.loanBalance + " is debited");
    }

    public void takeLoan(){
        if(this.balance < (this.loanBalance + (this.loanBalance * 0.1))){
            System.out.println("Please deposit required amount in the bank");
            return;
        }
        this.balance -= this.loanBalance + this.loanBalance * 0.1;
        System.out.println((this.loanBalance + (this.loanBalance * 0.1)) + " is credited");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.setBalance(10000);
        System.out.println("The balance is: " + hdfc.getBalance());
        hdfc.deposit(2000);
        hdfc.withdraw(1000);
        System.out.println("The balance is: " + hdfc.getBalance());
        double amount = 2000;
        hdfc.giveLoan(amount);
        hdfc.takeLoan();

    }
}
