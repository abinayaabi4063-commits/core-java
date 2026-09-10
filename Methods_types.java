public class Methods_types {
    public static void main(String[] args) {
        // 1. Calling Methods - calling all
        System.out.println("--- Simple Method Types ---");
        display(); // without argument, without return
        checkAge(20); // with argument, without return
        studentDetails("Abinaya", "CSE", 12345); // multiple argument
        int total = addFiveNumbers(10, 20, 30, 40, 50); // with arg, with return
        System.out.println("Total 5 Numbers: " + total);
        int sum = add(); // without arg, with return
        System.out.println("Sum 10+100: " + sum);
        addThreeNumbers(5, 10, 15); // with arg, without return
        System.out.println("Int Return: " + intAdd(10, 20, 30)); // returning int
        System.out.println("Double Return: " + doubleAdd(10.5, 20.5, 30.0)); // returning double
        System.out.println("--- Method Overloading ---");
        System.out.println(add(10, 20)); // overloading int
        System.out.println(add(10.5, 20.5)); // overloading double
        System.out.println(add("Hi ", "Abinaya")); // overloading string
    }


    // 1. Without argument, without return
    static void display() {
        System.out.println("Welcome to Credo Systemz");
    }

    // 2. With argument, without return
    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Eligible: " + age);
        } else {
            System.out.println("Not Eligible: " + age);
        }
    }

    // 3. Multiple arguments
    static void studentDetails(String name, String dept, int pin) {
        System.out.println("Name: " + name + ", Dept: " + dept + ", Pin: " + pin);
    }

    // 4. With argument, with return type
    static int addFiveNumbers(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    // 5. Without argument, with return type
    static int add() {
        int a = 10;
        int b = 100;
        return a + b;
    }

    // 6. With argument, without return type
    static void addThreeNumbers(int a, int b, int c) {
        System.out.println("3 Numbers Sum: " + (a + b + c));
    }

    // 7. Method returning int
    static int intAdd(int a, int b, int c) {
        return a + b + c;
    }

    // 8. Method returning double
    static double doubleAdd(double a, double b, double c) {
        return a + b + c;
    }

    // 9. Method Overloading - int
    static int add(int a, int b) {
        return a + b;
    }

    // 10. Method Overloading - double
    static double add(double a, double b) {
        return a + b;
    }

    // 11. Method Overloading - String
    static String add(String a, String b) {
        return a + b;
    }
}