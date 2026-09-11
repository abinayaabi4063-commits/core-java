// 1. Access Modifiers - yaar access pannalam nu solrathu
class AccessExample {

    public String name = "Abinaya"; // Ella edathilayum theriyum

    private int age = 20; // Same class la mattum theriyum

    protected String dept = "CSE"; // Same package + child class

    String college = "Credo"; // Default - same package la mattum
}

class Student extends AccessExample {
    void show() {
        System.out.println("public: " + name);
        // System.out.println(age); // private - error varum
        System.out.println("protected: " + dept);
        System.out.println("default: " + college);
    }
}

// 2. Non-Access Modifiers - static, final
class OtherModifiers {

    static String collegeName = "Credo College"; // Ella object kum same

    final int maxMark = 100; // Maatha mudiyathu, fixed

    static void greet() {
        System.out.println("static method - object illaama call pannalam");
    }

    final void rule() {
        System.out.println("final method - override panna mudiyathu");
    }
}

public class Modifiers {
    public static void main(String[] args) {

        System.out.println("1. Access Modifiers:");
        Student s = new Student();
        s.show();

        System.out.println("\n2. Non-Access Modifiers:");
        System.out.println("static variable: " + OtherModifiers.collegeName);
        OtherModifiers.greet(); // object vendaam

        OtherModifiers obj = new OtherModifiers();
        System.out.println("final variable: " + obj.maxMark);
        // obj.maxMark = 200; // error - final ah maatha mudiyathu
        obj.rule();
    }
}