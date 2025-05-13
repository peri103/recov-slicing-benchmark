import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        int minutesToSet = 30;

        /* write */ Date updatedDate = DateUtils.setMinutes(date, minutesToSet);
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, java.util.Calendar.MINUTE);

        System.out.println("Original Date: " + date);
        System.out.println("Updated Date with Minutes Set: " + updatedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}