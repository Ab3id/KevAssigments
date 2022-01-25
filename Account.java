class Account{
    double balance;

    Account(){
      
    }

    void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    double withdraw(double withdrawAmount){
        double remainingBalance = this.balance >= 10000 ? this.balance - withdrawAmount : 0.0;
        this.balance = remainingBalance;
        return balance;
    }

    void createAccount(double initialDeposit){
        this.balance = initialDeposit;
    }

}