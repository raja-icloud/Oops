import users.Staff;
import users.Student;

public class AccessModifier {
    public static void main(String[] args) {
        Staff s1 = new Staff();

        Student s2 = new Student();
        s2.name = "Student One"; // public property access
        // s2.mobile = "987654321"; // access protected property is not possible outside package
    }
}