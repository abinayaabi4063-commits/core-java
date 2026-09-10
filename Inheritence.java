// 1. Single Inheritance
class Inheritence{
    void house() { System.out.println(" "); }
}
class Child extends Parent {
    void car() { System.out.println("Child Car"); }
}

// 2. Multilevel Inheritance
class GrandFather {
    void land() { System.out.println("GrandFather Land"); }
}
class Father extends GrandFather {
    void bike() { System.out.println("Father Bike"); }
}
class Son extends Father {
    void laptop() { System.out.println("Son Laptop"); }
}

// 3. Hierarchical Inheritance
class Animal {
    void eat() { System.out.println("Animal Eats"); }
}
class Dog extends Animal {
    void bark() { System.out.println("Dog Barks"); }
}
class Cat extends Animal {
    void meow() { System.out.println("Cat Meows"); }
}

public class InheritanceShort {
    public static void main(String[] args) {
        
        // Single
        System.out.println("1. Single:");
        Child c = new Child();
        c.house(); c.car();

        // Multilevel
        System.out.println("\n2. Multilevel:");
        Son s = new Son();
        s.land(); s.bike(); s.laptop();

        // Hierarchical
        System.out.println("\n3. Hierarchical:");
        Dog d = new Dog();
        d.eat(); d.bark();
        Cat cat = new Cat();
        cat.eat(); cat.meow();
    }
}