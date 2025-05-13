import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a date instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15);
        Date date = calendar.getTime();

        // Use the setDays method to modify the date
        /* write */ date = DateUtils.setDays(date, 1);

        // Perform some unrelated operations
        List<Date> dateList = new ArrayList<>();
        dateList.add(date);
        dateList.add(DateUtils.addDays(date, 5));
        dateList.add(DateUtils.addMonths(date, 1));

        // Format the dates and print them
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Date d : dateList) {
            System.out.println("Formatted Date: " + sdf.format(d));
        }

        // More unrelated operations
        int sumDays = 0;
        for (Date d : dateList) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            sumDays += cal.get(Calendar.DAY_OF_MONTH);
        }
        System.out.println("Sum of Days: " + sumDays);

        // Use the truncate method to read the modified date
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DATE);

        // Output the result
        System.out.println("Truncated Date: " + sdf.format(truncatedDate));

        // Additional unrelated operations
        Date nextMonthDate = DateUtils.addMonths(truncatedDate, 1);
        System.out.println("Next Month Date: " + sdf.format(nextMonthDate));

        Calendar cal = Calendar.getInstance();
        cal.setTime(nextMonthDate);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of Week for Next Month Date: " + dayOfWeek);
    }
}