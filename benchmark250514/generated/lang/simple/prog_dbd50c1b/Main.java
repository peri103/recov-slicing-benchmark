import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        // Set the minutes of the date to 30
        /* write */ Date modifiedDate = DateUtils.setMinutes(date, 30);

        // Truncate the date to remove seconds and milliseconds
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, java.util.Calendar.MINUTE);

        System.out.println("Modified Date: " + modifiedDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}