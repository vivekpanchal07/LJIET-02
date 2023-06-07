package Interface_Example;

interface ibankAccount{
    boolean dipositeAmount (double amount);
    boolean withdrawAmount(double amount);
    double checkBalance();
}
class SavingAccount implements ibankAccount{
    double balance = 0;
    double daylimit = 1000;
    double todayswithdraw = 0;


    @Override
    public boolean dipositeAmount(double amount) {
        balance = balance + amount;
        System.out.println("You have Deposited "+amount);
        System.out.println("You Account Balance is "+balance);
        return true;
    }

    @Override
    public boolean withdrawAmount(double amount) {
        if(balance < amount){
            System.out.println("You have insufficient Fund");
            return false;
        }else if(todayswithdraw + amount > daylimit){
            System.out.println("Day limit over");
            return false;
        }else{
            balance = balance-amount;
            todayswithdraw = todayswithdraw + amount;
            System.out.println("Amount withdrawed "+amount);
            System.out.println("Current Balance: "+balance);
            return true;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

class CurrentAccount implements ibankAccount {
    double balance = 0;

    @Override
    public boolean dipositeAmount(double amount) {
        balance = balance + amount;
        System.out.println("You have Deposited "+amount);
        System.out.println("You Account Balance is "+balance);
        return true;
    }

    @Override
    public boolean withdrawAmount(double amount) {
        if(balance < amount){
            System.out.println("Insufficient Balance");
            return false;
        }else{
            balance = balance-amount;
            System.out.println("Amount withdrawed "+amount);
            System.out.println("Current Balance: "+balance);
            return true;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}


public class TestInterface {
    public static void main(String[] args) {
        ibankAccount mySavingAc = new SavingAccount();
        mySavingAc.dipositeAmount(2000);
        mySavingAc.withdrawAmount(1000);
        mySavingAc.withdrawAmount(1000);
        mySavingAc.checkBalance();

        ibankAccount myCurrentAc = new CurrentAccount();
        myCurrentAc.dipositeAmount(2000);
        myCurrentAc.withdrawAmount(1000);
        myCurrentAc.withdrawAmount(1000);
        myCurrentAc.withdrawAmount(1000);
        myCurrentAc.checkBalance();


    }

}
