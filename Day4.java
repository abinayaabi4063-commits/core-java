// import java.util.Calendar;
// class Day4 {
   // public static void main(String args[]) {
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


       //3------------------DIFFERENCE B/W DATES---------------->
       import java.time.LocalDate;
import java.time.Period; 
class Day4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2004, 11, 14);
        LocalDate date2 = LocalDate.of(2006, 9, 30);
        Period diff = Period.between(date1, date2);
        System.out.println("Date 1 : " + date1);
        System.out.println("Date 2 : " + date2);
        System.out.println("");
        System.out.println("Years : " + diff.getYears());
        System.out.println("Months : " + diff.getMonths());
        System.out.println("Days : " + diff.getDays());
    }
}
   // }
//}
        
