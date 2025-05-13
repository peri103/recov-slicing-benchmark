import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a date instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15);
        Date date = calendar.getTime();

        // Use the setDays method to modify the date
        /* write */ date = DateUtils.setDays(date, 1);

        // Use the truncate method to read the modified date
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DATE);

        // Output the result
        System.out.println(truncatedDate);
    }
}