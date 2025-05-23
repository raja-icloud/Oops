class Test {
    static int x = 10;
    static int y = 20;
    static int z = 30;
    static int a = 40;

    public static void printDetails() {
        System.out.println("======================================");
        System.out.println("===== x = "+ Test.x + "            ============");
        System.out.println("===== y = "+ Test.y + "            ============");
        System.out.println("===== z = "+ Test.z + "            ============");
        System.out.println("===== a = "+ Test.a + "            ============");
        System.out.println("======================================");
    }

    private Test() {}
}

class User {
    String name;
    String address;
    int age;

    User(String name, String address, int age) {
       this.name = name;
       this.address = address;
       this.age = age;
    } 

     public void printDetails() {
        System.out.println("======================================");
        System.out.println("===== NAME = "+ this.name + "        ============");
        System.out.println("===== ADDRESS = "+ this.address + "    ============");
        System.out.println("===== AGE = "+ this.age + "            ============");
        System.out.println("======================================");
    }
}

class Student extends User {
    int studentId;

    Student(String name, String address, int age, int id) {
        super(name, address, age);
        this.studentId = id;
    }

}

class Staff  extends User {
    int staffId;

    Staff(String name, String address, int age, int id) {
      super(name, address, age);
      this.staffId = id;
    }
  
}


public class Inheritance2 {
    public static void main(String[] args) {
        // We can write our program
        Student s1 = new Student("user1", "addOne", 30, 1);
        s1.printDetails();
        Student p2 = new Student("user2", "addTwo", 31, 2); 
        p2.printDetails();


        Staff staff1 = new Staff("staf1", "addOne", 30, 1);
        staff1.printDetails();
        Staff staff2 = new Staff("staf1", "addTwo", 31, 2); 
        staff2.printDetails();


        // Test.printDetails(); // accessing static method
       
    }
}
