public class Demo4 {
    public static void main(String[] args) {
        // int i = 5;

        // WHILE LOOP
        // while(i < 10) {
        //     System.out.println("loop started");
        // }

        // System.out.println("Loop ended");

        // FOR LOOP
        // for(; ;) {
        //     System.out.println(i);
        // }

        // FOR LOOP - COMMA SEPERATED VARIATION
        // for(int i = 1, j = 1; i <= 10 && j <= 5; i++, j+=2) {
        //     System.out.println(i * j);
        // }

        // FOR LOOP USING BOOLEAN VALUE
        // boolean b = true;
        // for(int i = 0; b == true; i++) {
        //     System.out.println(i);
        //     if(i == 1000) {
        //         b = false;
        //     }
        // }

        // NESTED FOR LOOP
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
