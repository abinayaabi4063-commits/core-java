// Inheritance - child class gets parent class properties

// 1. Single - Mother and Daughter
class Mother {
    void care() {
        System.out.println("Mother Cares");
    }
}
class Daughter extends Mother {
    void study() {
        System.out.println("Daughter Studies");
    }
}

// 2. Single - Laptop and GamingLaptop
class Laptop {
    void powerOn() {
        System.out.println("Laptop Power On");
    }
}
class GamingLaptop extends Laptop {
    void playGame() {
        System.out.println("Gaming Laptop Plays Game");
    }
}

// 3. Single - College and StudentData
class College {
    String collegeName = "Credo College";
    void showCollege() {
        System.out.println("College: " + collegeName);
    }
}
class StudentData extends College {
    String student = "Abinaya";
    void showStudent() {
        System.out.println("Student: " + student);
    }
}

// 4. Multilevel - Bird -> Parrot -> BabyParrot
class Bird {
    void fly() {
        System.out.println("Bird Flies");
    }
}
class Parrot extends Bird {
    void speak() {
        System.out.println("Parrot Speaks");
    }
}
class BabyParrot extends Parrot {
    void cute() {
        System.out.println("Baby Parrot is Cute");
    }
}

// 5. Multilevel - Human -> Staff -> Teacher
class Human {
    void talk() {
        System.out.println("Human Talks");
    }
}
class Staff extends Human {
    void work() {
        System.out.println("Staff Works");
    }
}
class Teacher extends Staff {
    void teach() {
        System.out.println("Teacher Teaches");
    }
}

// 6. Hierarchical - Phone -> Android / iPhone
class Phone {
    void call() {
        System.out.println("Phone Calls");
    }
}
class Android extends Phone {
    void androidOS() {
        System.out.println("Android OS");
    }
}
class IPhone extends Phone {
    void ios() {
        System.out.println("iOS System");
    }
}

public class InheritanceNewExample {
    public static void main(String[] args) {

        // 1. Single
        Daughter d1 = new Daughter();
        d1.care();
        d1.study();
        System.out.println("--------------------");

        // 2. Single
        GamingLaptop g1 = new GamingLaptop();
        g1.powerOn();
        g1.playGame();
        System.out.println("--------------------");

        // 3. Single
        StudentData s1 = new StudentData();
        s1.showCollege();
        s1.showStudent();
        System.out.println("--------------------");

        // 4. Multilevel
        BabyParrot bp = new BabyParrot();
        bp.fly();
        bp.speak();
        bp.cute();
        System.out.println("--------------------");

        // 5. Multilevel
        Teacher t1 = new Teacher();
        t1.talk();
        t1.work();
        t1.teach();
        System.out.println("--------------------");

        // 6. Hierarchical
        //Android a1 = new Android();
        a1.call();
        a1.androidOS();
        System.out.println();
        IPhone i1 = new IPhone();
        i1.call();
        i1.ios();
    }
}