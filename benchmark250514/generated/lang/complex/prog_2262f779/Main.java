import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        int minutesToSet = 30;
        
        // Unrelated code to add complexity
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, 2);
        Date twoHoursLater = calendar.getTime();

        // Manipulating the date
        Date anotherDate = DateUtils.addDays(date, 5);
        Date truncatedAnotherDate = DateUtils.truncate(anotherDate, Calendar.DAY_OF_MONTH);

        /* write */ Date updatedDate = DateUtils.setMinutes(date, minutesToSet);
        
        // More unrelated code
        calendar.setTime(updatedDate);
        calendar.add(Calendar.SECOND, 45);
        Date secondsAddedDate = calendar.getTime();
        
        // Even more unrelated code
        Date dateWithoutSeconds = DateUtils.truncate(secondsAddedDate, Calendar.SECOND);
        Date dateWithoutHours = DateUtils.truncate(dateWithoutSeconds, Calendar.HOUR_OF_DAY);
        
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, Calendar.MINUTE);

        System.out.println("Original Date: " + date);
        System.out.println("Date Two Hours Later: " + twoHoursLater);
        System.out.println("Another Date Truncated: " + truncatedAnotherDate);
        System.out.println("Updated Date with Minutes Set: " + updatedDate);
        System.out.println("Date with Seconds Added: " + secondsAddedDate);
        System.out.println("Date without Seconds: " + dateWithoutSeconds);
        System.out.println("Date without Hours: " + dateWithoutHours);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}