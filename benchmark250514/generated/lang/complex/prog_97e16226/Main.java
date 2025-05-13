import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Some unrelated date manipulations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        
        // Print future date
        System.out.println("Future Date: " + futureDate);

        // Round the date to the nearest semi-month
        /* write */ Date roundedDate = DateUtils.round(date, DateUtils.SEMI_MONTH);
        
        // More unrelated date manipulations
        calendar.setTime(roundedDate);
        calendar.add(Calendar.HOUR, 3);
        Date modifiedDate = calendar.getTime();

        // Print modified date
        System.out.println("Modified Date: " + modifiedDate);

        // Truncate the date to the nearest semi-month
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, DateUtils.SEMI_MONTH);

        // Print original, rounded and truncated dates
        System.out.println("Original Date: " + date);
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // Additional unrelated logic
        Date anotherDate = new Date();
        calendar.setTime(anotherDate);
        calendar.add(Calendar.MINUTE, 15);
        Date anotherModifiedDate = calendar.getTime();
        
        // Print another modified date
        System.out.println("Another Modified Date: " + anotherModifiedDate);
    }
}