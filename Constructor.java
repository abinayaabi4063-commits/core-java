class Student {

    String name;
    int age;

    // 1. No-Argument Constructor - namma create pannura empty constructor
    Student() {
        name = "Abinaya";
        age = 20;
        System.out.println("1. No-Argument Constructor Called");
    }

    // 2. Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("2. Parameterized Constructor Called");
    }

    // 3. Copy Constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
        System.out.println("3. Copy Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("--------------------");
    }
}

// Default Constructor ku vera example
class Teacher {
    // namma ethuvume eluthala, Java thanave oru Default Constructor kudukum
    void show() {
        System.out.println("4. Default Constructor - Java kuduthathu (invisible)");
        System.out.println("--------------------");
    }
}

public class Constructor {
    public static void main(String[] args) {

        // No-Argument - namma eluthuna empty constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized
        Student s2 = new Student("Kenisha", 21);
        s2.display();

        // Copy
        Student s3 = new Student(s2);
        s3.display();

        // Default - namma onnume eluthala, Java thanave kudukum
        Teacher t1 = new Teacher();
        t1.show();
    }
}