 class Recursional {

    // 1. Factorial - 5! = 5*4*3*2*1 = 120
    static int factorial(int n) {
        if (n == 1) {
            return 1; // Stop point
        }
        return n * factorial(n - 1); // Thanney thirumba koopdu
    }

    // 2. Sum - 1+2+3+4+5 = 15
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // 3. Print Numbers 1 to 5
    static void printNum(int n) {
        if (n > 5) {
            return; // Stop
        }
        System.out.println(n);
        printNum(n + 1); // Next number ku call
    }

    public static void main(String[] args) {

        System.out.println("1. Factorial of 5:");
        System.out.println(factorial(5)); // 120
        System.out.println("--------------------");

        System.out.println("2. Sum of 5 numbers:");
        System.out.println(sum(5)); // 15
        System.out.println("--------------------");

        System.out.println("3. Print 1 to 5:");
        printNum(1);
    }
}