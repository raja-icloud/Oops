public class ExceptionConcept {
    final String MY_APP_NAME = "Caculator";
    public static void main(String[] args) {
        int a = -10;
        int b = 2;
        // System.out.println(divition1(a, b)); 

        try {
            System.out.println(divition2(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String divition1(int a, int b) {
        String result = ""; // constant
        try {
           result = (a / b) + "";
        } catch(Exception e) {
           result = e.getMessage();
        } finally {
            System.out.println("process completed");
        }
        return result;
    }

    public static int divition2(int a, int b) throws Exception {
        if(a < 0 || b<0) {
            throw new Exception("Error by - value");
        }
        return a / b;
    }
}
