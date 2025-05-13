import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        
        Date date = calendar.getTime();
        
        /* write */ date = DateUtils.setWeeks(date, 10);
        
        // Additional unrelated code to make the program more complex
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.set(Calendar.YEAR, 2022);
        anotherCalendar.set(Calendar.MONTH, Calendar.DECEMBER);
        anotherCalendar.set(Calendar.DAY_OF_MONTH, 25);
        
        Date anotherDate = anotherCalendar.getTime();
        anotherDate = DateUtils.addDays(anotherDate, 5);
        
        Date truncatedAnotherDate = DateUtils.truncate(anotherDate, Calendar.DAY_OF_MONTH);
        System.out.println("Truncated Another Date: " + truncatedAnotherDate);
        
        // More operations
        Calendar yetAnotherCalendar = Calendar.getInstance();
        yetAnotherCalendar.set(Calendar.YEAR, 2021);
        yetAnotherCalendar.set(Calendar.MONTH, Calendar.JANUARY);
        yetAnotherCalendar.set(Calendar.DAY_OF_MONTH, 1);
        
        Date yetAnotherDate = yetAnotherCalendar.getTime();
        yetAnotherDate = DateUtils.addMonths(yetAnotherDate, 2);
        
        Date truncatedYetAnotherDate = DateUtils.truncate(yetAnotherDate, Calendar.MONTH);
        System.out.println("Truncated Yet Another Date: " + truncatedYetAnotherDate);
        
        // Return to the original read operation
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR);
        
        System.out.println("Truncated Original Date: " + truncatedDate);
    }
}