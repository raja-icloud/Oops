package users;

public class Staff {
    public String name;
    public String mobile;

    public Staff() {
        Student s1 = new Student();
        s1.name = "Student One"; // public property access
        s1.mobile = "987543210"; // protectd property access is possible with in a package
        // s1.wallet = 2000; // private property access is not possible ourside of a class

        System.out.println(s1.name);
        System.out.println(s1.mobile);
        // System.out.println(s1.wallet);
    }
}
