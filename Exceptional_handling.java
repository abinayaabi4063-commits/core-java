 class Exceptional_handling {
    public static void main(String args[]) {

        //-----------------Exception Handling------------

        //1. ArithmeticException - divide by zero
        try {
            int a = 50;
            int b = 0;
            int ans = a / b;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println("1. Arithmetic Error: Cannot divide by zero");
        }

        //2. ArrayIndexOutOfBoundsException - Invalid array index
        int[] marks = {80, 90, 100};
        try {
            System.out.println(marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. Array Error: Invalid Index");
        }

        //3. NullPointerException - Using a null reference
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("3. Null Error: String is null");
        }

        //4. NumberFormatException - Invalid String-to-number conversion
        try {
            String check = "Abinaya";
            int num = Integer.parseInt(check);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("4. Number Format Error: Cannot convert ABC to number");
        }

        //5. StringIndexOutOfBoundsException - Invalid String index
        try {
            String lang = "Java";
            System.out.println(lang.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("5. String Index Error: Invalid index");
        }

        //6. finally - Executes after try/catch
        try {
            int result = 10 / 2;
            System.out.println("6. Finally Try Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
           // System.out.println("Program Completed - Finally always runs");
        }
    }
}