package users;

public class Student {
    private Long wallet;
    protected String mobile;
    public String name;

    public Student() {
        this.wallet = 5000L;
        System.out.println(this.wallet);
        
    }
}
