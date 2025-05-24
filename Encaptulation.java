class Bank {
    private int wallet = 10000;
    private String[] customers = {"RAJA", "K7", "KUMAR"};
    

    public int casier(String name, int amount) {
        // check customer is exist on our customer list or not
        boolean isExist = false;
        for (String customerName : customers) {
            if(name.equals(customerName)) isExist = true;
        }
        // customer should exist & request amount should be on bank
        if(isExist && wallet >= amount) {
            wallet = wallet - amount;
            return amount;
        } else {
            return 0;
        }
    }

    public String checkBankBalance(String name) {
        // check customer is exist on our customer list or not
        boolean isExist = false;
        for (String customerName : customers) {
            if(name.equals(customerName)) isExist = true;
        }

        if(isExist) {
            return "current bank balance : " + this.wallet; 
        } else {
            return "You are un authorized persion, i cant give balance details";
        }
    }
}



public class Encaptulation {
    public static void main(String[] args) {
        Bank sbi = new Bank();
        // RAJA 
        int rajaWallet = sbi.casier("RAJA", 1000);
        System.out.println(rajaWallet);

        String result = sbi.checkBankBalance("K7");
        System.out.println(result);
        
        String result2 = sbi.checkBankBalance("vignesh");
        System.out.println(result2);
    }
}
