interface Calculator {
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);
    public abstract int mul(int a, int b);
}


class Casio implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
}

class Philips  implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
        Calculator casio = new Casio();
        System.out.println("Addition by casio :" + casio.add(10, 20));

        Calculator philips = new Philips();
        System.out.println("Addition by philips :" + philips.add(10, 20));
    }
}
