 class Day2{
    public static void main (String[] args ){
        //celcius to fahrenheit
        System.out.println(" ");
        System.out.println("----CELSIUS TO FAHRENHEIT----");
        double celsius = 20.87;
        double fahrenheit = (celsius*(9.0/5))+32;
        System.out.println("Celsius : "+celsius+" C");
        System.out.println("Fahrenheit : "+fahrenheit+" F");
        System.out.println(" ");

        System.out.println("---KILOMETER TO MILES---");
        double kilometer=43.89;
        double miles=kilometer*0.621;
        System.out.println("Distance in Kilometers : "+kilometer+" Km");
        System.out.println("Distance in Miles : "+miles+" Miles");
        System.out.println(" ");

        System.out.println("---MILES TO KILOMETER---");
        double Miles=30.28;
        double kiloMeter=Miles*1.609;
        System.out.println("Distance in Miles : "+Miles+" Miles");
        System.out.println("Distance in Kilometers : "+kiloMeter+" Km");
        System.out.println(" ");

        //speed,distance,time calculator
        System.out.println("1.TIME CALCULATOR");
        System.out.println("2.DISTANCE CALCULATOR");
        System.out.println("3.SPEED CALCULATOR");
        System.out.println(" ");
        String ch = "1";
        System.out.println("Choice : "+ch);
        switch(ch){
            case "1":
                double Speed = 10;
                double Distance = 20;
                System.out.println("Speed : "+Speed);
                System.out.println("Distance : "+Distance);
                double Time = Distance/Speed;
                System.out.println("Time : "+Time +" s");
                System.out.println(" ");
                break;

            case "2":
                double speed=10;
                double time = 2;
                System.out.println("Speed : "+speed);
                System.out.println("Time : "+time);
                double distance = speed*time;
                System.out.println("Distance in meters : "+distance+" m");
                System.out.println(" ");
                break;

            case "3":
                double _Distance = 20;
                double _Time = 2;
                System.out.println("Distance : "+_Distance);
                System.out.println("Time : "+_Time);
                double _Speed = _Distance/_Time;
                System.out.println("Speed : "+_Speed+" m/s");
                System.out.println(" ");
                break;


            default:
                System.out.println("Please Enter from the given options (1/2/3)");
                System.out.println(" ");
                break;

        }


        //Salary Calculator
        System.out.println("---SALARY CALCULATOR---");
        int year = 2030;
        double annual_income=1000000;
        double monthly_income=annual_income/12;
        double daily_income,hourly_income;
        if((year%4==0 && year%100!=0)||year%400==0){
            daily_income=annual_income/366;
            hourly_income=annual_income/(366*24);
        }
        else{
            daily_income=annual_income/365;
            hourly_income=annual_income/(365*24);

        }
        System.out.println("Annual Income : "+annual_income);
        System.out.println("Monthly Income : "+monthly_income);
        System.out.println("Daily Income : "+ daily_income);
        System.out.println("Hourly Income : "+ hourly_income);
        System.out.println(" ");

        //simple intrest
        System.out.println("---SIMPLE INTEREST---");
        int P=100000;
        double R=7.5;
        int T=12;
        
        System.out.println("Principle : "+P);
        System.out.println("Rate : "+R);
        System.out.println("Time : "+T);
        System.out.println(" ");

        double Simple_Interest=P*R*T;
        System.out.println("Simple Interest : "+Simple_Interest);
        System.out.println(" ");

        //Area
        System.out.println("---AREA---");
        System.out.println(" ");
        System.out.println("1.Square");
        System.out.println("2.Rectangle");
        System.out.println("3.Circle");
        System.out.println("4.Triangle");
        System.out.println(" ");
        String Ch="3";
        System.out.println("Choice Entered : "+Ch);
        switch(Ch){

            case "1":
                int s = 12;
                double square_area=s*s;
                System.out.println("Area of Square : "+square_area);
                System.out.println(" ");
                break;

            case "2":
                int l=12,b=3;
                double rectangle_area=l*b;
                System.out.println("Area of Rectangle : "+rectangle_area);
                System.out.println(" ");
                break;

            case "3":
                double r = 12.67;
                double circle_area=3.14*r*r;
                System.out.println("Area of Circle : "+circle_area);
                System.out.println(" ");
                break;

            case "4":
                int height=12,base=12;
                double triangle_area =0.5*base*height;
                System.out.println("Area of Triangle : "+triangle_area);
                System.out.println(" ");
                break;

            default:
                System.out.println("Please Enter Valid Options (1/2/3/4)");
                System.out.println(" ");
                break;
        }

    //VowelsChecking
    System.out.println("---VOWELS CHECK---");
    char txt='a';
    System.out.println("Letter : "+txt);
    if(txt=='a'||txt=='e'||txt=='i'||txt=='o'||txt=='u'){
        System.out.println("Vowel - Small letter");
        System.out.println(" ");
    }
    else if(txt=='A'||txt=='E'||txt=='I'||txt=='O'||txt=='U'){
        System.out.println("Vowel - Capital letter");
        System.out.println(" ");
    }
    else{
        System.out.println("Consonants");
        System.out.println(" ");
    }
    

    //Grading System
    System.out.println("---GRADING SYSTEM---");
    int mark=90;
    System.out.println("Marks secured : "+mark);
    if(mark>=90){
        System.out.println("Grade A");
        System.out.println(" ");
    }
    else if (mark>=80){
        System.out.println("Grade B");
        System.out.println(" ");
    }
    else if (mark>=70){
        System.out.println("Grade C");
        System.out.println(" ");
    }
    else if (mark>=50){
        System.out.println("Grade D");
        System.out.println(" ");
    }
    else{
        System.out.println(" Fail ");
        System.out.println(" ");
    }

    //if statements
    //Positive,Negative,Zero
    System.out.println("---CHECK +VE,-VE OR 0---");
    int n=12;
    System.out.println("Number : "+n);
    if(n>0){
        System.out.println(n+" - Positive");
        System.out.println(" ");
    }
    if (n<0){
        System.out.println(n+" - Negative");
        System.out.println(" ");
    }
    if(n==0){
        System.out.println("Zero");
        System.out.println(" ");
    }

    //Voting Eligibility
    System.out.println("---VOTING ELIGIBILITY---");
    int age=20;
    System.out.println("Age : "+age);
    if (age>=18){
        System.out.println("Eligible To Vote");
        System.out.println(" ");
    }
    if(age<18){
        System.out.println("Not Eligible To Vote");
        System.out.println(" ");
    }

    //marks>90
    System.out.println("---CHECK MARKS > 90---");
    int marks=67;
    System.out.println("Mark : "+marks);
    if(marks>90){
        System.out.println("Marks greater than 90");
        System.out.println(" ");
    }
    if(marks<90){
        System.out.println("Marks less than 90");
        System.out.println(" ");
    }

    //salary>50000
    System.out.println("---CHECK SALARY > 50,000---");
    double salary=68000;
    System.out.println("Salary : "+salary);
    if(salary>50000){
        System.out.println("Salary Greater than 50k");
        System.out.println(" ");
    }
    if(salary<50000){
        System.out.println("Salary less than 50k");
        System.out.println(" ");
    }

    //temperature > 40C
    System.out.println("---CHECK TEMPERATURE > 40C---");
    double temp=67;
    System.out.println("Temperature : "+temp+" C");
    if(temp>40){
        System.out.println("Temperature greater than 40C");
        System.out.println(" ");
    }
    if(temp<40){
        System.out.println("Temperature less than 40C");
        System.out.println(" ");
    }

    //if....else statements
    System.out.println("---CHECK ODD OR EVEN---");
    int num=65;
    System.out.println("Number : "+num);
    if(num%2==0){
        System.out.println("Even Number");
        System.out.println(" ");
    }
    else{
        System.out.println("Odd Number");
        System.out.println(" ");
    }

    //pass or fail
    System.out.println("---CHECK PASS OR FAIL---");
    int Mark=65;
    System.out.println("Marks : "+Mark);
    if(Mark>=35){
        System.out.println("Pass");
        System.out.println(" ");
    }
    else{
        System.out.println("Fail");
        System.out.println(" ");
    }

    //max of two nums
    System.out.println("---MAX OF TWO NUMBERS---");
    int num1=65,num2=54;
    System.out.println("Number 1 : "+num1);
    System.out.println("Number 2 : "+num2);
    if(num1>num2){
        System.out.println("Number 1 is Maximum");
        System.out.println(" ");
    }
    else{
        System.out.println("Number 2 is Maximum");
        System.out.println(" ");
    }

    //Upper or Lower case
    System.out.println("---CHECK UPPER OR LOWER ---");
    char s = 'A';
    System.out.println("Letter : "+s);
    if(Character.isUpperCase(s)){
        System.out.println("Upper case");
        System.out.println(" ");
    }
    else{
        System.out.println("Lower Case");
        System.out.println(" ");
    }

    //leapyer or not
    System.out.println("---CHECK LEAP YEAR---");
    int _Year=2008;
    System.out.println("Year : "+_Year);
    if((_Year%4==0 && _Year%100!=0)||_Year%400==0){
        System.out.println(" Leap Year ");
        System.out.println(" ");
    }
    else{
        System.out.println("Not a Leap Year");
        System.out.println(" ");
    }

    //if....else if statements
    //salary-high,medium,low
    System.out.println("---CHECK SALARY- HIGH , MEDIUM , LOW---");
    double Salary=100000;
    System.out.println("Salary : "+Salary);
    if(Salary>=70000){
        System.out.println(" HIGH ");
        System.out.println(" ");
    }
    else if (Salary>=30000){
        System.out.println(" MEDIUM ");
        System.out.println(" ");
    }
    else{
        System.out.println(" LOW ");
        System.out.println(" ");
    }

    //Largest of 3 numbers
    
    System.out.println("---LARGEST OF 3 NUMBER---");
    int num_1=17,num_2=24,num_3=99;
    System.out.println("A : "+num_1);
    System.out.println("B : "+num_2);
    System.out.println("C : "+num_3);
    System.out.println(" ");
    if(num_1>num_2 && num_1>num_3){
        System.out.println("A Biggest");
        System.out.println(" ");
    }
    else if (num_2>num_1 && num_2>num_3){
        System.out.println("B Biggest");
        System.out.println(" ");
    }
    else if(num_3>num_1 && num_3>num_2){
        System.out.println("C Biggest");
        System.out.println(" ");
    }
    else{
        System.out.println("Values are Same");
        System.out.println(" ");
    }
    

    //income-Tax
    System.out.println("---TAX CRITERIA---");
    double annualIncome=1700000;
    System.out.println("Annual income : "+annualIncome);
    if(annualIncome<=400000){
        System.out.println("No Tax");
        System.out.println(" ");
    }
    else if (annualIncome<=800000){
        System.out.println(" 5% Tax "+(annualIncome*0.05));
        System.out.println(" ");
    }
    else if (annualIncome<=1200000){
        System.out.println(" 10% Tax "+(annualIncome*(0.10)));
        System.out.println(" ");
    }
    else if (annualIncome<=1600000){
        System.out.println(" 15% Tax "+(annualIncome*(0.15)));
        System.out.println(" ");
    }
    else if (annualIncome<=2000000){
        System.out.println(" 20% Tax "+(annualIncome*(0.20)));
        System.out.println(" ");
    }
    else if (annualIncome<=2400000){
        System.out.println("25% Tax "+(annualIncome*(0.25)));
        System.out.println(" ");
    }
    else{
        System.out.println(" 30% Tax "+(annualIncome*(0.30)));
        System.out.println(" ");
    } 

    //ticket price based on age category 
    
    System.out.println("---TICKET PRICE---");
    int Age=18;
    System.out.println("Age : "+Age);
    if(Age<=5){
        System.out.println("Free");
        System.out.println(" ");
    }
    else if (Age<=12){
        System.out.println("Price : 100 ");
        System.out.println(" ");
    }
    else if (Age<=18){
        System.out.println("Price : 150 ");
        System.out.println(" ");
    }
    else if (Age<=59){
        System.out.println("Price : 200 ");
        System.out.println(" ");
    }
    else{
        System.out.println("Price : 120 (Senior Citizen Discount)");
        System.out.println(" ");

    }

    //nested if...else
    //college admission criteria
    System.out.println("---COLLEGE CRITERIA---");
    int Student_Age =22;
    int Student_marks=88;
    System.out.println("Age : "+Student_Age);
    System.out.println("Marks Secured : "+Student_marks);
    if(Student_Age>=18){
        if(Student_marks>=60){
            System.out.println("Eligible ");
            System.out.println(" ");
        }
        else{
            System.out.println("Not Eligible");
            System.out.println(" ");
        }
    }
    else{
        System.out.println("Not Eligible");
        System.out.println(" ");
    }


    //loan eligibility
    System.out.println("---LOAN ELIGIBILITY---");
    double income = 100000;
    double credit = 300;

    System.out.println("Salary : "+income);
    System.out.println("Credit Score : "+credit);

    if(income>=30000){
        if(credit<650){
            System.out.println("Not Eligible");
            System.out.println(" ");
        }
        else if(credit<=749){
            System.out.println("Eligible for Basic Loan ");
            System.out.println(" ");
        }
        else if(credit<=849){
            System.out.println("Eligible for Standard Loan ");
            System.out.println(" ");
        }
        else{
            System.out.println("Eligible for Premium Loan ");
            System.out.println(" ");
        }
    }
    else{
        System.out.println("Not Eligile");
    }

    //Ternary operator 
    //Largest of two nums 
    System.out.println("---LARGEST OF TWO NUMBERS---");
    int a=12,b=67;
    System.out.println("A : "+a);
    System.out.println("B : "+b);
    String Check=(a>b)?"A is Greater ":"B is Greatest";//ternary operator
    System.out.println(Check); 
    System.out.println(" ");

    //even or odd
    System.out.println("---EVEN OR ODD---");
    int A=12;
    System.out.println("Number : "+A);
    String CH=(A%2==0)?"Even Number":"Odd Number";
    System.out.println(CH); 
    System.out.println(" ");

    }

    }