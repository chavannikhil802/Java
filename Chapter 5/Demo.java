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
        // int to byte
        i = 240;

        b = (byte)i;
        System.out.println(b);

        // TRUNCATING CONVERSION  
        // float to int 
        float f = 15.678f;

        i = (int)f;
        System.out.println(i);

        // TYPE PROMOTION
        b = 50;
        b =(byte) (50 * 2);
        System.out.println(b);
    }
}