// Polymorphism - 2 types

// 1. Compile-time - Method Overloading (Same name, different parameters)
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of 2 nums: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 nums: " + (a + b + c));
    }
    void add(String a, String b) {
        System.out.println("Join: " + a + b);
    }
}

// 2. Runtime - Method Overriding (Parent child same method)
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() { // Same method ah maathrom
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        System.out.println("1. Overloading (Compile-time):");
        Calculator cal = new Calculator();
        cal.add(10, 20);
        cal.add(10, 20, 30);
        cal.add("Abinaya ", "Kenisha");

        System.out.println("\n2. Overriding (Runtime):");
        Animal a1 = new Dog(); // Animal ah Dog maadhiri
        a1.sound(); // Dog Barks

        Animal a2 = new Cat();
        a2.sound(); // Cat Meows
    }
}