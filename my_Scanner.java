import java.util.Scanner;
 class my_Scanner{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Positive, Negative or Zero
        System.out.print("1. Enter a Number: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("It is Zero");
        }

        // 2. Even or Odd
        System.out.print("\n2. Enter a Number to check Even/Odd: ");
        int num2 = sc.nextInt();
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is Even");
        } else {
            System.out.println(num2 + " is Odd");
        }

        // 3. Addition of Two Numbers
        System.out.print("\n3. Enter First No: ");
        int a = sc.nextInt();
        System.out.print("Enter Second No: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);

        // 4. Read Name - single word
        System.out.print("\n4. Enter Your Name: ");
        String name = sc.next();
        System.out.println("Hello " + name);

        // 5. Read Number - age example
        System.out.print("\n5. Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Your Age is " + age);

        // 6. Read Full Name - with space
        sc.nextLine(); // buffer clear panna - idhu must
        System.out.print("\n6. Enter Your Full Name: ");
        String fullName = sc.nextLine();
        System.out.println("Full Name = " + fullName);

        sc.close();
        System.out.println("\nDone!");
    }
}