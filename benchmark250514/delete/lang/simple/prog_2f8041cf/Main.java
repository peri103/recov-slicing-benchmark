import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        
        // Set an example date
        calendar.set(2023, Calendar.OCTOBER, 15); // October 15, 2023
        Date date = calendar.getTime();

        // Use DateUtils to set weeks
        int weeksToAdd = 2;
        /* write */ Date updatedDate = DateUtils.setWeeks(date, calendar.get(Calendar.WEEK_OF_YEAR) + weeksToAdd);

        // Use DateUtils to truncate the date to the start of the week
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, Calendar.WEEK_OF_YEAR);

        // Output the truncated date
        System.out.println(truncatedDate);
    }
}