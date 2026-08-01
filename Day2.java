 //class Day1{
   // public static void main (String args []){

   //1-------------->college admission eligibility: ( Nested if...else)

       // int age = 18;         
       // int marks = 60;      
        
       // System.out.println("college admission eligibility");
       // System.out.println("Age : " + age);
       // System.out.println("Marks : " + marks);
       // System.out.println(" ");

       // if(age >= 18){ 
       //     System.out.println("Age Condition : Pass");
            
        //    if(marks >= 60){ 
        //        System.out.println("Marks Condition : Pass");
        //        System.out.println("Result : Eligible");
        //    }
        //    else{ 
        //        System.out.println("Marks Condition : Fail");
        //        System.out.println("Result : Not Eligible");
        //    }
        //}
       // else{ 
       //     System.out.println("Age Condition : Fail");
//System.out.println("Result : Not Eligible");
      //  }
   // }
//}

        //2 --------------->sdutent grade: ( if statement )

       // int marks = 92; 
       // System.out.println("sdutent grade system");
       // System.out.println("Marks  : " + marks);
       // System.out.println(" ");

       // if(marks >= 90 && marks <= 100){ 
          //  System.out.println("Grade : A");
       // }

       // if(marks >= 80 && marks <= 89){ 
           // System.out.println("Grade : B");
       // }

       // if(marks >= 70 && marks <= 79){ 
           // System.out.println("Grade : C");
       // }

        //if(marks >= 50 && marks <= 69){ 
           // System.out.println("Grade : D");
       // }

       // if(marks < 50 && marks >= 0){ 
           // System.out.println("Result : Fail");
       // }

        //if(marks > 100 || marks < 0){ 
           // System.out.println("Invalid Marks. Please enter 0 to 100");
       // }
        
   // }
//}

        // 3------------>positive or negative number (if statement):

       // int num = -7; 
        
       // System.out.println("check positive or negative");
       // System.out.println("Number : " + num);
       // System.out.println(" ");

       // if(num > 0){ 
          //  System.out.println(num + " is Positive Number");
       // }

       // if(num < 0){ 
           // System.out.println(num + " is Negative Number");
        //}

       // if(num == 0){ 
           // System.out.println("The Number is Zero");
        //}
        
    //}
//}
// 4--------------> salary catogory-low,medium,high:(if else if):
       // System.out.println(" salary catogery");
       // double salary = 45000;
       // System.out.println("Salary : ₹" + salary);
       // if(salary >= 70000)
           // System.out.println("Category : HIGH");
       // else if(salary >= 30000)
           // System.out.println("Category : MEDIUM");
       // else
           // System.out.println("Category : LOW");
       // System.out.println(" ");
   // }
//}

        //5-----------------> annual income(if else if ladder)
       // double income = 95000; 
        
       // System.out.println("income tax slab");
       // System.out.println("Annual Income : ₹" + income);
       // System.out.println(" ");

       // if(income <= 4000){ 
           // System.out.println("Tax Category : No Tax");
           // System.out.println("Tax Amount : ₹0");
       // }
       // else if(income <= 8000){ 
           // double tax = income * 0.05; 
            //System.out.println("Tax Category : 5% Tax");
           // System.out.println("Tax Amount : ₹" + tax);
       // }
       // else if(income <= 12000){ 
           // double tax = income * 0.10; 
           // System.out.println("Tax Category : 10% Tax");
           // System.out.println("Tax Amount : ₹" + tax);
       // }
       // else if(income <= 16000){ 
            //double tax = income * 0.20; // 20%
           // System.out.println("Tax Category : 20% Tax");
           // System.out.println("Tax Amount : ₹" + tax);
       // }
//else{ 
         //   double tax = income * 0.30; // 30%
          //  System.out.println("Tax Category : 30% Tax");
          //  System.out.println("Tax Amount : ₹" + tax);
       // }
        
  //  }
//}
        // 6------------------>Celsius to farenheat:


       // double celsius = 37.0; 
        //( Formula ):
        //double fahrenheit = (celsius * 9/5) + 32;
        
       // System.out.println(" celsius to farenheat ");
       // System.out.println("Celsius : " + celsius + " °C");
       // System.out.println("Fahrenheit : " + fahrenheit + " °F");
        
   // }
//}

       // 7-------------------> Kilometer to miles:

       // double kilometers = 10.0; 
       // (Formula): 
       // double miles = kilometers * 0.621371;
        
       // System.out.println("--- KILOMETER TO MILES ---");
       // System.out.println("Kilometers : " + kilometers + " km");
       // System.out.println("Miles : " + miles + " miles");
        
    //}
//}
    
        //8-------------------> Miles to kilometer:
       // double miles = 10.0; 
        //(Formula) :
       // double kilometers = miles * 1.609344;
        
       // System.out.println("--- MILES TO KILOMETER ---");
       // System.out.println("Miles : " + miles + " miles");
       // System.out.println("Kilometers : " + kilometers + " km");
        
    //}
//}
//9------------------>time calculator:
       // int seconds = 5000;  
       // int hours = seconds / 3600;           
       // int minutes = (seconds % 3600) / 60; 
       // int sec = seconds % 60;               
        
       // System.out.println(seconds + " seconds = " + hours + "h " + minutes + "m " + sec + "s");
    //}
//}

        //10------------------>distance calculator:
       // double speed = 60;   
       // double time = 2.5;   
       // double distance = speed * time;  // Formula: D = S x T
        
       // System.out.println("distance calculator");
       // System.out.println("Speed : " + speed + " km/h");
       // System.out.println("Time : " + time + " hours");
       // System.out.println("Distance : " + distance + " km");
   // }
//}

        //11------------------->speed calculator:
       // double distance = 150;  
       // double time = 2.5;      
       // double speed = distance / time;  
        
       // System.out.println(" speed calculator");
       // System.out.println("Distance : " + distance + " km");
       // System.out.println("Time : " + time + " hours");
       // System.out.println("Speed : " + speed + " km/h");
    //}
//}
//12------------------------->vowel check:
        
       // char ch = 'E';  // nee vera letter try pannu
        
       // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        //   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            
          //  System.out.println(ch + " is a VOWEL");
       // }
       // else{
         //   System.out.println(ch + " is a CONSONANT");
      //  }
    //}
//}