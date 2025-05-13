import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a list to store multiple dates
        ArrayList<Date> dateList = new ArrayList<>();

        // Create a calendar instance and set it to a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 1);
        Date date = calendar.getTime();

        // Add the initial date to the list
        dateList.add(date);

        // Set the day of the month to 15
        /* write */ date = DateUtils.setDays(date, 15);

        // Add the modified date to the list
        dateList.add(date);

        // Perform some unrelated operations
        for (int i = 0; i < dateList.size(); i++) {
            Date currentDate = dateList.get(i);
            Calendar cal = Calendar.getInstance();
            cal.setTime(currentDate);
            int month = cal.get(Calendar.MONTH);
            System.out.println("Month of date " + (i + 1) + ": " + month);
        }

        // Truncate the date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DATE);

        // Add the truncated date to the list
        dateList.add(truncatedDate);

        // Print all dates in the list
        for (Date d : dateList) {
            System.out.println("Date: " + d);
        }

        // Perform more unrelated operations
        int sumDays = 0;
        for (Date d : dateList) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            sumDays += cal.get(Calendar.DAY_OF_MONTH);
        }
        System.out.println("Sum of days in all dates: " + sumDays);
    }
}