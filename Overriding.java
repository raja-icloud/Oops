class Parent {
    public void printMsg() {
        System.out.println("This message from parent");
    }
}


public class Overriding  extends Parent {
    @Override
    public void printMsg() {
    super.printMsg();
      System.out.println("This message from child");
    }

    public static void main(String[] args) {
        Overriding or = new Overriding();
        or.printMsg();
    }
}
