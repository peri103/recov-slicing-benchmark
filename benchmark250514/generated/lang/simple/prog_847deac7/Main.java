import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        // Set the week of the year to 2
        /* write */ calendar.set(Calendar.WEEK_OF_YEAR, 2);

        // Truncate the date to the start of the day
        /* read */ Date truncatedDate = DateUtils.truncate(calendar.getTime(), Calendar.DATE);

        System.out.println(truncatedDate);
    }
}