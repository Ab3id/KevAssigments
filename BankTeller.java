public class BankTeller extends Account{

    BankTeller() {

    }

    void createCustomerAccount(double startingBalance){
        this.createAccount(startingBalance);
    }


    void depositFundsToCustomerAccount(double depositAmount){
        this.deposit(depositAmount);
    }

   
    
}
