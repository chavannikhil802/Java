class Demo {
    public static void main(String[] args) {
        boolean b = true;
        int i = 5;

        // SELECTION STATEMENT - IF
        if(i == 5) {
            System.out.println("i is 5");
        }
        else {
            System.out.println("i is not 5");
        }

        // EVEN/ODD NUMBER
        if(i%2 == 0) {
            System.out.println("i is even number");
        }
        else {
            System.out.println("i is odd number");
        }

        // NESTED IF
        if(i > 5) {
            if(i < 10) {
                System.out.println("i is greater than 5 and less than 10");
            } 
            else {
                System.out.println("i is greater than 5 and greater than 10");
            }
        }
        else {
            System.out.println("i is less than 5");
        }
    }
}