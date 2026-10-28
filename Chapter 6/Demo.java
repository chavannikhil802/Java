class Demo {
    public static void main(String[] args) {
        // OPERATORS IN JAVA

        // Arithmetic Operators --> +, -, *, /, %, +=, -=, *=, /=, %=, ++, --

        int a = 5;
        int b = 10;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = b/a;
        int g = b%a;
        System.out.println(c+ " , "+d+ " , "+e+ " , "+f+ " , "+g);

        int h = a+2;
        h = h+2;
        h+=2;
        System.out.println(h);

        h = h-2;
        h-=2;
        System.out.println(h);

        h*=3;
        System.out.println(h);

        h/=3;
        System.out.println(h);

        h%=3;
        System.out.println(h);
        
        // INCREMENT OPERATOR
        int i = 6;
        i++;
        System.out.println(i);

        // DECREMENT OPERATOR
        i--;
        System.out.println(i);

        // PRE-INCREMENT/PRE-DECREMENT & POST-INCREMENT/POST-DECREMENT
        int j = 7;
        j++; // postfix increment
        ++j; // prefix increment
        System.out.println(j);

        int k = j++;
        System.out.println(k);

        int l = ++j;
        System.out.println(l);
    }
}