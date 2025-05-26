// Raja
interface ATM {
    public abstract void withdraw();
    public abstract void balance();
    public abstract void trasfer();    
}

interface Test {
    public abstract void print();
}

interface AdvanceATM extends ATM, Test {
    public abstract void depoist();
    public abstract void NRITransfer();
}

// Team One (US)
class SbiAtm implements ATM, AdvanceATM {

    public void test() {
        // 
    }

    @Override
    public void balance() {
        System.out.println("Balance checking by SBI ATM");
    }

    @Override
    public void trasfer() {
       System.out.println("Balance trasfered by SBI ATM");
    }

    @Override
    public void withdraw() {
        System.out.println("Amount taken by SBI ATM");
    }

    @Override
    public void NRITransfer() {
        System.out.println("NRI trasfer completed by SBI ATM");
    }

    @Override
    public void depoist() {
        System.out.println("Amount deposited by SBI ATM");
    }

    @Override
    public void print() {
       System.out.println("test method");
    }

}

// Team One (Singapore)
class CanaraAtm  implements ATM, AdvanceATM {

    @Override
    public void balance() {
         System.out.println("Balance checking by Canara ATM");
    }

    @Override
    public void trasfer() {
        System.out.println("Balance trasfered by Canara ATM"); 
    }

    @Override
    public void withdraw() {
        System.out.println("Amount taken by Canara ATM");
    }

        @Override
    public void NRITransfer() {
        System.out.println("NRI trasfer completed by Canara ATM");
    }

    @Override
    public void depoist() {
        System.out.println("Amount deposited by Carana ATM");
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }
}



public class InterfaceConcept {
    public static void main(String[] args) {
        SbiAtm sbi = new SbiAtm();
        sbi.test();

        ATM sbiAtm = new SbiAtm();
        sbiAtm.balance();
        sbiAtm.trasfer();
        sbiAtm.withdraw();

        ATM canaraATM = new CanaraAtm();
        canaraATM.balance();
        canaraATM.trasfer();
        canaraATM.withdraw();
    

        AdvanceATM  avdSbiAtm = new SbiAtm();
        avdSbiAtm.balance();
        avdSbiAtm.trasfer();
        avdSbiAtm.withdraw();
        avdSbiAtm.depoist();
        avdSbiAtm.NRITransfer();

        AdvanceATM  avdCanaraAtm = new CanaraAtm();
        avdCanaraAtm.balance();
        avdCanaraAtm.trasfer();
        avdCanaraAtm.withdraw();
        avdCanaraAtm.depoist();
        avdCanaraAtm.NRITransfer();
    }
}

// inteface means just method declaration
// what are the classes implements the interface, which is responsible to write the definition
// one class can EXTEND another only one class
// one interface can EXTEND another multiple interfaces
// on class can IMPLEMENT another multiple interfaces



