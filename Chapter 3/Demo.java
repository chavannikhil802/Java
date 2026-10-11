public class Demo {
    public static void main(String[] args) {
        // INTEGERS
        // byte b = 5;

        // Saving byte as binary
        // byte b = 0b101;

        // Saving byte as octal
        // byte b =  05;

        // Saving byte (15) as Hexa-decimal
        byte b = 0XF;

        short s = 10;
        int i = 4000;
        long l = 10000;
        
        System.out.println("Integer values -> "+b+", "+s+", "+i+", "+l);

        // REAL NUMBERS
        float f = 10.54f;
        double d = 23.09848;

        System.out.println("Real number values -> "+f+", "+d);

        // CHARACTERS
        char c = 'a';

        System.out.println("Character values -> "+c);

        // BOOLEAN
        boolean bool = false;

        System.out.println("Boolean values -> "+bool);
    }
}