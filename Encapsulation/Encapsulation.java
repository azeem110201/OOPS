class BankAccount{
    private double balance;

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(this.balance <= amount){
            System.out.println("Not having enough amount");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " Money has been withdrawed");
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println(amount + " Money has been deposited");
    }
}

class Encapsulation{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(10000.0);
        System.out.println("The balance is: " + b.getBalance());
        b.deposit(2000);
        b.withdraw(1000);
        System.out.println("The balance is: ",b.getBalance());
    }
}