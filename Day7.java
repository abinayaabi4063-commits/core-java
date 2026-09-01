public class Day7{
    public static void greet(){
    System.out.println("Hello , World!");
    }
    public static void dispname(){
        System.out.println("abinaya");
    }
    public static void printnumbers(){
        int i=1;
        while(i<=10){
           System.out.print(i+" , ");
           i+=1;
        }
    }
    public static void evennumbers(){
        int i1=0;
        while(i1<=20){
            if (i1%2==0){
                System.out.print(i1+" , ");
            }
            i1+=1;
        }
    }
    public static void multiplicationtable(){
        int i2=1;
        while(i2<=10){
            System.out.println(i2+"*"+" 5 = "+(i2*5));
            i2+=1;
    }
        }

    public static void greet(String Name){
        System.out.println("Welcome "+Name);

    } 
    public static void square(int n){
        System.out.println("Square : "+n*n);
    }
    public static void cube(int n1){
        int cube=n1*n1*n1;
        System.out.println("Cube : "+cube);
    }
    public static void positive_negative_zero(int n3){
        if(n3>0){
            System.out.println("Positive Number");
        }
       else if (n3<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
       }
    }
    public static void multiplication(int a,int b){
        int mul=a*b;
        System.out.println("Multiplication : "+mul);
    }
    public static void largest(int a,int b){
        if (a>b){
            System.out.println("Largest Number - "+a);
        }
        else if (b>a){
            System.out.println("Largest Number - "+b);
        }
        else{
            System.out.println("Both are Equal");
        }
    }
    public static int getAge(){
        int age=18;
        return age; 
    }
    public static int getNum(){
        int Number=10;
        return Number;
    }
    public static int getSum(){
        int a=10,b=20;
        int add = a+b;
        return add;
    }
    public static int getsquare(){
        int n=5;
        int square=n*n;
        return square;
    }
    public static String getName(){
        String name="Saloni";
        return name;
    }
    public static int getLargest(){
        int a=12,b=13;
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int addition_(int a , int b){
        return a+b;
    }
    public static int subtraction_(int a , int b){
        return a-b;
    }
    public static int mul_(int a , int b){
        return a*b;
    }
    public static int division_(int a , int b){
        return a/b;
    }
    public static int square_(int a){
        return a*a;
    }
    public static int cube_(int a){
        return a*a*a;
    }
    public static String Even_Odd(int a){
        if (a%2==0){
            return "Even Number";
        }
        else{
            return "odd Number";
        }
    }
    public static int largest_(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }
    public static double simple_intrest(int p,int r,int t){
        return (p*r*t)/100;
    }
    public static double calculateArea(int l,int b){
        return l*b;
    }
    
    public static void main(String args[]){
        System.out.println("---WITHOUT ARGS WITHOUT RETUEN TYPE---");
        System.out.println();

        System.out.println("---HELLO WORLD!!---");
        greet();
        System.out.println();

        System.out.println("---DISPLAY NAME---");
        dispname();
        System.out.println();

        System.out.println("---PRINT NUMBERS FROM 1-10---");
        printnumbers();
        System.out.println();

        System.out.println("---PRINT EVEN NUMBERS FROM 1-20---");
        evennumbers();
        System.out.println();

        System.out.println("---MULTIPLICATION TABLE OF 5---");
        multiplicationtable();
        System.out.println();

        //--------------------------------------------------------------

        System.out.println("---WITH ARGUMENTS + WITHOUT RETURN TYPE---");
        System.out.println();

        greet("Saloni");
        
        System.out.println("---SQUARE OF A NUMBER---");
        square(12);
        System.out.println();

        System.out.println("---CUBE OF A NUMBER---");
        cube(2);
        System.out.println();
        
        System.out.println("---NUMBER IS +VE,-VE OR ZERO---");
        positive_negative_zero(0);
        System.out.println();
        
        System.out.println("---MULTIPLICATION---");
        multiplication(12,3);
        System.out.println();
        
        System.out.println("---LARGEST OF TWO---");
        largest(12,12);
        System.out.println();

        //----------------------------------------------------------

        System.out.println("---WITHOUT ARGS + WITH RETURN ---");
        System.out.println();

        System.out.println("---GET NUMBER---");
        System.out.println(getNum());

        System.out.println("---GET SUM---");
        System.out.println(getSum());

        System.out.println("---GET SQUARE---");
        System.out.println(getsquare());

        System.out.println("---GET NAME---");
        System.out.println(getName());

        System.out.println("---GET AGE---");
        System.out.println(getAge());

        System.out.println("---GET LARGEST---");
        System.out.println(getLargest());
        System.out.println();

        //----------------------------------------------------

        System.out.println("---WITH ARGS+WITH RETURN---");
        System.out.println();

        System.out.println("---ADDITION---");
        System.out.println(addition_(12, 34));

        System.out.println("---SUBTRACTION---");
        System.out.println(subtraction_(12, 34));

        System.out.println("---MULTIPLICATION---");
        System.out.println(mul_(12, 34));

        System.out.println("---DIVISION---");
        System.out.println(division_(12, 34));

        System.out.println("---SQUARE---");
        System.out.println(square_(6));

        System.out.println("---CUBE---");
        System.out.println(cube_(2));

        System.out.println("---EVEN OR ODD---");
        System.out.println(Even_Odd(9));

        System.out.println("---LARGEST NUM---");
        System.out.println(largest_(12, 13));

        System.out.println("---SIMPLE INTREST---");
        System.out.println(simple_intrest(12, 3, 5));

        System.out.println("---AREA CALCULATOR---");
        System.out.println(calculateArea(12, 13));

        //-----------------------------------------------
    }
   
    
}