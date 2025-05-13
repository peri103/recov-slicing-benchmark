import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15); // Initial date: October 15, 2023
        Date date = calendar.getTime();

        // Use the setDays method to change the day of the month
        /* write */ Date modifiedDate = DateUtils.setDays(date, 10);

        // Use the truncate method to truncate the date to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, Calendar.DATE);

        System.out.println(truncatedDate);
    }
}