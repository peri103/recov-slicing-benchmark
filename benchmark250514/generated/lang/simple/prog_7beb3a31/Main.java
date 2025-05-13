import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15); // Initialize calendar to a specific date
        Date date = calendar.getTime();

        /* write */ date = DateUtils.setDays(date, 25); // Set the day of the month to 25
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DAY_OF_MONTH); // Truncate to the start of the day

        System.out.println(truncatedDate);
    }
}