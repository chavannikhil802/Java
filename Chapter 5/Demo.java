class Demo {
    public static void main(String[] args) {
        // IMPLICIT CONVERSIONS
        // byte to int
        byte b = 24;
        int i;

        i = b;
        System.out.println(i);

        // char to int
        char c = 'a';

        i = c;
        System.out.println(i);

        // EXPLICIT CONVERSION
        i = 24;

        b = (byte)i;
        System.out.println(b);
    }
}