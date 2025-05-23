

import users.AMStudent;

public class AM {
    public static void main(String[] args) {
        AMStudent s1 = new AMStudent();
        System.out.println(s1.name);
        // System.out.println(s1.wallet); // We can access protected property outside a package
        System.out.println(s1.getWallet());
        // System.out.println(s1.id); // direct way to access private property (Not possible)
        System.out.println(s1.getId()); // indirect way to access private property (possible)
    }
}
