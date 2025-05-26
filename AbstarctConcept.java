


abstract class SbiATM  {
    String name = "";
    public abstract void balance(String accountNumber); // method decalration

    public void test() { // self metthod with definition    
    }
}

class SBITeam  extends SbiATM {
    
    @Override
    public void balance(String accountNumber) { // method defintion of parent (interface)
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
