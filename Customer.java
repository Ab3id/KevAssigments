public class Customer extends Account{
    Customer (){

    }

    void depositToMyAccount (double depositAmount){
        this.deposit(depositAmount);
    }

    double withdrwaFromMyAccount (double withdrawAmount){
        double response = 1;
        double withdraw = this.withdraw(withdrawAmount);
        if(withdraw > 0.0){
            String result = "You`ve successfully withdrawn "+withdrawAmount+" from your account, Balance :: "+withdraw;
            System.out.println(result);
        }else{
            response = 0;
        }
        return response;
    }
}
