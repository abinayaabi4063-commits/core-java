 import java.util.Calendar;
 class Day4 {
    public static void main(String args[]) {
 //Calendar cal = Calendar.getInstance();
//1-------------------CALANDAR ADD,MINUS--------------------->
       // cal.set(2004, Calendar.NOVEMBER, 14);
       // System.out.println(" : " + cal.getTime());
       // cal.add(Calendar.MONTH, -2);
       
       // System.out.println(" : " + cal.getTime());
       // cal.add(Calendar.DAY_OF_MONTH, 10);
       // System.out.println(" : " + cal.getTime());


       //2-----------------CALENDAR=YEAR,MONTH,DAY----------->
       // cal.set(2004, Calendar.NOVEMBER, 14); 
       // System.out.println("Year : " + cal.get(Calendar.YEAR));
       // System.out.println("MONTH : " + (cal.get(Calendar.MONTH) + 1)); 
       // System.out.println("Day : " + cal.get(Calendar.DAY_OF_MONTH));


       //3------------------DIFFERENCE B/W DATES--------------->
      // import java.time.LocalDate;
//import java.time.Period; 
//class Day4 {
    //public static void main(String[] args) {
       // LocalDate date1 = LocalDate.of(2004, 11, 14);
       // LocalDate date2 = LocalDate.of(2006, 9, 30);
       // Period diff = Period.between(date1, date2);
       // System.out.println("Date 1 : " + date1);
       // System.out.println("Date 2 : " + date2);
       // System.out.println("");
       // System.out.println("Years : " + diff.getYears());
       // System.out.println("Months : " + diff.getMonths());
       // System.out.println("Days : " + diff.getDays());
    //}
//}


//4-------------------------DURATION------------------------------>
        Calendar t1 = Calendar.getInstance();
        t1.set(Calendar.HOUR_OF_DAY, 10);
        t1.set(Calendar.MINUTE, 30);
        t1.set(Calendar.SECOND, 0);
        
        
        Calendar t2 = Calendar.getInstance();
        t2.set(Calendar.HOUR_OF_DAY, 12);
        t2.set(Calendar.MINUTE, 45);
        t2.set(Calendar.SECOND, 0);
        long diffInMilli = t2.getTimeInMillis() - t1.getTimeInMillis();

        //5----- MILLISECONS CONVERT TO HOURSE AND MINUTE---------->


        long diffInMinutes = diffInMilli / (1000 * 60);
        long diffInHours = diffInMilli / (1000 * 60 * 60);
        System.out.println("Start Time:10.30 ");
        System.out.println("End Time:12.45 ");
        System.out.println("");
        System.out.println("Difference : " + diffInHours + " hours");
        System.out.println("Difference : " + diffInMinutes + " minutes");
    }
}
   // }
//}
        
