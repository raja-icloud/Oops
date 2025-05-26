


abstract class SbiATM  {
    public abstract void balance();
    public abstract void transfer();
    public abstract void deposit();
}

class SBITeam  extends SbiATM {

    @Override
    public void balance() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deposit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void transfer() {
        // TODO Auto-generated method stub
        
    }

}




public class AbstarctConcept {
    public static void main(String[] args) {
        System.out.println("Test");
    }
}

// 1. abstract class can have method declaration (as like interface)
// 2. abstract class can have method definitions of parent(interface)
// 3. abstract class can have self method & properties
// 4. abstract class can avoid the definition for parent (interface)
// 5. but normal class must wirte the definition for parent (interface)
