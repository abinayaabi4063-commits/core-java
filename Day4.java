 class Day4 {
    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.DECEMBER, 25);
        cal.add(Calendar.MONTH, -2);
        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println(cal.getTime());

        // Calendar cal = Calendar.getInstance();
        // System.out.println(cal.getTime());
        // System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        // System.out.println(cal.get(Calendar.MINUTE));
        // System.out.println(cal.get(Calendar.SECOND));
        // System.out.println(cal.get(Calendar.YEAR));
        // System.out.println(cal.get(Calendar.MONTH) + 1);
        // // Jan - 0, Dec-11
        // System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        // Duration - Calculates the difference between two times 
        // LocalTime T1 = LocalTime.of(10, 30);
        // LocalTime T2 = LocalTime.of(12, 45);
        // Duration answer = Duration.between(T1, T2);
        // System.out.println(answer.toHours());
        // System.out.println(answer.toMinutes());
        // Period - Finds the difference between two dates 
        // LocalDate start = LocalDate.of(1997, 12, 9);
        // LocalDate end = LocalDate.now();
        // Period answer = Period.between(start, end);
        // System.out.println(answer.getYears());
        // DateTimeFormatter Formats dates and time into user friendly formats 
        // LocalDateTime answer = LocalDateTime.now();
        // DateTimeFormatter display = DateTimeFormatter.ofPattern("EEEE dd MMM yyyy HH:mm a");
        // System.out.println(answer.format(display));
        // Date 
        // Date today = new Date();
        // System.out.println(today);
        // LocalDateTime - Returns both current date and current time 
        // LocalDateTime answer=LocalDateTime.now();
        // System.out.println(answer);
        // getYear(), getMonth(), getDayofMonth(), getHour(),
        // getMinute(), 
        // LocalTime - Returns only the current time 
        // LocalTime time = LocalTime.now();
        // System.out.println(time);
        // System.out.println(time.plusMinutes(10));
        // System.out.println(time.minusMinutes(10));
        // System.out.println(time.plusHours(4));
        // System.out.println(time.minusHours(4));
        // System.out.println(time.getHour());
        // System.out.println(time.getMinute());
        // System.out.println(time.getSecond());
        // LocalDate - Returns only the current date 
        // LocalDate date = LocalDate.now();
        // System.out.println(date);
        // System.out.println(date.plusYears(2));
        // System.out.println(date.minusYears(2));
        // System.out.println(date.plusMonths(2));
        // System.out.println(date.minusMonths(2));
        // System.out.println(date.plusDays(10));
        // System.out.println(date.minusDays(10));
        // System.out.println(date.getDayOfMonth());
        // System.out.println(date.getMonth());
        // System.out.println(date.getMonthValue());
        // System.out.println(date.getYear());
    }
}
