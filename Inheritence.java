// 1. SINGLE - One Parent -> One Child
class Inheritence {
    void property() { System.out.println("Father Property"); }
}
class Son extends Father {
    void bike() { System.out.println("Son Bike"); }
}

// 2. MULTILEVEL - GrandFather -> Father -> Son
class GrandFather {
    void land() { System.out.println("GrandFather Land"); }
}
class Father1 extends GrandFather {
    void house() { System.out.println("Father House"); }
}
class Son1 extends Father1 {
    void car() { System.out.println("Son Car"); }
}

// 3. HIERARCHICAL - One Parent -> Many Childs
class Animal {
    void eat() { System.out.println("Animal Eats"); }
}
class Dog extends Animal {
    void bark() { System.out.println("Dog Barks"); }
}
class Cat extends Animal {
    void meow() { System.out.println("Cat Meows"); }
}

// 4. MULTIPLE - 
interface Mom {
    void care();
}
interface Dad {
    void money();
}
class Child2 implements Mom, Dad {
    public void care() { System.out.println("Mom Care"); }
    public void money() { System.out.println("Dad Money"); }
}

// 5. HYBRID - Hierarchical + Multiple + Multilevel mix
interface A { void methodA(); }
class B implements A {
    public void methodA() { System.out.println("Method A"); }
    void methodB() { System.out.println("Method B"); }
}
class C extends B {
    void methodC() { System.out.println("Method C"); }
}
class D extends B {
    void methodD() { System.out.println("Method D"); }
}

public class AllInheritance {
    public static void main(String[] args) {

        System.out.println("1. Single:");
        Son s = new Son();
        s.property(); s.bike();

        System.out.println("\n2. Multilevel:");
        Son1 s1 = new Son1();
        s1.land(); s1.house(); s1.car();

        System.out.println("\n3. Hierarchical:");
        Dog d = new Dog(); d.eat(); d.bark();
        Cat c = new Cat(); c.eat(); c.meow();

        System.out.println("\n4. Multiple (Interface):");
        Child2 ch = new Child2();
        ch.care(); ch.money();

        System.out.println("\n5. Hybrid:");
        C objC = new C();
        objC.methodA(); objC.methodB(); objC.methodC();
        D objD = new D();
        objD.methodA(); objD.methodB(); objD.methodD();
    }
}