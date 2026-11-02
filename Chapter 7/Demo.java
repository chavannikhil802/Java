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

        // IF - ELSE-IF LADDER
        i = 9;

        if(i == 5) {
            System.out.println("i is 5");
        }
        else if(i == 6) {
            System.out.println("i is 6");
        } 
        else if(i == 7) {
            System.out.println("i is 7");
        } 
        else if(i == 8) {
            System.out.println("i is 8");
        } 
        else if(i == 9) {
            System.out.println("i is 9");
        } 
        else if(i == 10) {
            System.out.println("i is 10");
        } 

        // IF - ELSE-IF LADDER example
        int age = 9;

        if(age > 80) {
            System.out.println("You are very old");
        }
        else if(age > 60) {
            System.out.println("You are old");
        }
        else if(age > 40) {
            System.out.println("You are becoming old");
        }
        else if(age > 20) {
            System.out.println("You are young");
        }
        else {
            System.out.println("you are a too young");
        }
    }
}