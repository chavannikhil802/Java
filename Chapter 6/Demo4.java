public class Demo4 {
    public static void main(String[] args) {
        // LOGICAL OPERATORS
        int a = 5;
        int b = 10;
        int c = 15;

        boolean d = (a < b) && (b < c);
        System.out.println(d);

        // SHORT CIRCUIT
        boolean x = (a < b) & (b < c);
        System.out.println(x);
    }
}
