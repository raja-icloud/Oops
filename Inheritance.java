
class Parent {
   public int pWallet;

   Parent(int pWallet) {
        this.pWallet = pWallet;
   }
}

class Child extends Parent {
    int cWallet;

    Child(int cWallet, int pWallet) {
        super(pWallet); // Parent(pWallet)
        this.cWallet = cWallet;
        this.test();
    }

    public void test() {
        
    }
}


public class Inheritance {
    public static void main(String[] args) {

        Child ramesh = new Child(1000, 600);

        System.out.println(ramesh.cWallet);
        System.out.println(ramesh.pWallet);
    }
}