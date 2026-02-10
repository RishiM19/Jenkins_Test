public class Multiply {
    public static void main(String[] args) {
        String a = System.getenv("NUM1");
        String b = System.getenv("NUM2");


        int result = Integer.parseInt(a) * Integer.parseInt(b);
        System.out.println("Result = " + result);
    }
}
