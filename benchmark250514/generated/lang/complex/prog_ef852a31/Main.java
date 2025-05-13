import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        
        // Additional unrelated code: manipulate the calendar object
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date fiveDaysLater = calendar.getTime();
        System.out.println("Five days later: " + fiveDaysLater);
        
        /* write */ Date dateAfterAddingWeeks = DateUtils.addWeeks(currentDate, 2);
        
        // More unrelated code: format the current date
        System.out.println("Current Date: " + currentDate);
        
        // Additional unrelated code: check if the year is a leap year
        boolean isLeapYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
        System.out.println("Is leap year: " + isLeapYear);
        
        // Unrelated code: manipulate another date
        Date anotherDate = DateUtils.addDays(currentDate, 10);
        System.out.println("Another Date: " + anotherDate);
        
        /* read */ Date truncatedDate = DateUtils.truncate(dateAfterAddingWeeks, Calendar.DATE);
        
        // Unrelated code: output the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional unrelated code: calculate the difference in days between two dates
        long diffInMillies = anotherDate.getTime() - currentDate.getTime();
        long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days: " + diffInDays);
    }
}