public class Chaining {
    String name = "Test";

    public static void main(String[] args) {
        Chaining chaining = new Chaining();
        chaining.methodOne().methodTwo().methodThree();
     }

    public Chaining methodOne() {
        System.out.println("methodOne called");
        return this;
    }

    public Chaining methodTwo() {
        System.out.println("methodTwo called");
        return this;
    }

    public Chaining methodThree() {
        System.out.println("methodThree called");
        return this;
    }
}
