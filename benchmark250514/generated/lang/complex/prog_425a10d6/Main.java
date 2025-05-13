import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        List<Date> dateList = new ArrayList<>();

        // Set the month to February (1 in zero-based index)
        /* write */ date = DateUtils.setMonths(date, 1);

        // Add some dates to the list
        for (int i = 0; i < 5; i++) {
            calendar.set(2023, i, 15);
            dateList.add(calendar.getTime());
        }

        // Perform some operations on the date list
        for (Date d : dateList) {
            System.out.println("Original Date: " + d);
            Date monthStart = DateUtils.truncate(d, Calendar.MONTH);
            System.out.println("Start of Month: " + monthStart);
        }

        // Truncate the date to the start of the month
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MONTH);

        System.out.println("Truncated Date: " + truncatedDate);

        // Additional date manipulation
        Date newDate = DateUtils.addDays(truncatedDate, 10);
        System.out.println("New Date after adding 10 days: " + newDate);

        // Further operations
        for (int i = 0; i < dateList.size(); i++) {
            Date modifiedDate = DateUtils.addMonths(dateList.get(i), 1);
            System.out.println("Modified Date: " + modifiedDate);
        }
    }
}