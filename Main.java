import java.util.Scanner;

class BankSimulation{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankTeller teller = new BankTeller();
        Customer customer = new Customer();
        int userChoice;
        //initial account creation & deposit
        teller.createCustomerAccount(50000);
        System.out.println("Welcome to bank ABC, How may we help you");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        userChoice = in.nextInt();
        if(userChoice == 1){
            //deposit money
            double depositAmount;
            System.out.println("Deposit amount ?");
            depositAmount = in.nextDouble();
            customer.depositToMyAccount(depositAmount);
            System.out.println("Deposit successful, thank you");

            System.out.println("Welcome to bank ABC, How may we help you");
            System.out.println("1. Withdraw money");
            userChoice = in.nextInt();

            if(userChoice == 1){
                double withdrawAmount;
                double response;
                while (true){
                    System.out.println("Withdraw Amount ? ");
                    withdrawAmount = in.nextDouble();
                    response = customer.withdrwaFromMyAccount(withdrawAmount);
                    if(response == 0){
                        System.out.println("Insufficient Balance");
                        break;
                    }
                }
            }
            
        }else{
            double withdrawAmount;
            double response;
            while (true){
                System.out.println("Withdraw Amount ? ");
                withdrawAmount = in.nextDouble();
                response = customer.withdrwaFromMyAccount(withdrawAmount);
                if(response == 0){
                    System.out.println("Insufficient Balance");
                    break;
                }
            }

        }

        in.close();
       
    }
}
