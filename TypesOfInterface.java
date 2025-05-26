
// normal interface
interface ATM {
    public abstract void deposit();
    default void test() {
        System.out.println("default method called");
    }
    static void test2() {
        System.out.println("Static method of interface called");
    }
    static void test3() {
        System.out.println("Static method of interface called");
    }
}

// Marker interface (Just for Type declaration) Serializable, Clonable
interface AdvanceATM extends ATM {}

class  SbiATM implements AdvanceATM {
    @Override
    public void deposit() {
       System.out.println("deposit method called");
    } 
}

@FunctionalInterface
interface FunInterface {
    void subraction(int a, int b); 
}


public class TypesOfInterface {
    public static void main(String[] args) {
        // ATM created by normal interface
        ATM sbiAtm = new SbiATM();
        sbiAtm.deposit();
      
        // Type of ATM renamed by marker interface
        AdvanceATM atm = new SbiATM();
        atm.deposit();
        atm.test();

        addtion(5, 5);

        FunInterface funInterface =  (int a, int b) -> {
            System.out.println(a-b);
        };
        funInterface.subraction(4, 2);

    }

    public static void addtion(int a, int b) {
        System.out.println(a+b);
    }
}
