public class OverLoading {
    public static void main(String[] args) {
        OverLoading o = new OverLoading();
        o.print();
    }

    public void print() {
        System.out.println("print method called");
    }
 
    public void print(String msg) {
        System.out.println(msg);
    }

    public void print(String msg1, String msg2) {
        System.out.println(msg1 + msg2);
    }

    
}
