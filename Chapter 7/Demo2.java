public class Demo2 {
    public static void main(String[] args) {
        
        // SWITCH STATEMENTS
        int i = 2;

        // switch(expression) - Must evaluate to byte, short, int, char, Enumeration
        // Also, no duplicate cases allowed
        // After JDK 7, Strings can also be used as switch expression
        // After JDK 14, switch is further enjanced.

        switch(i) { 
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is greater than 3");
                break;
        }

        // NESTED SWITCH STATEMENT
        
        int j = 5;
        int k = 1;

        switch(j) {
            case 4: 
                System.out.println("j is 4");
                break;
            case 5:
                System.out.println("j is 5");
                switch(k) {
                    case 1:
                        System.out.println("k is 1");
                        break;
                    case 2:
                        System.out.println("k is 2");
                        break;
                    default:
                        System.out.println("k is not 1 or 2");
                        break;
                }
                break;
            default:
                System.out.println("j is not 4 or 5");
                break;
        }
    }
}
