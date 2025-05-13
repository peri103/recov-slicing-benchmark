import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        /* write */ Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR);

        // Additional complex operations
        List<Date> dateList = new ArrayList<>();
        dateList.add(date);
        dateList.add(ceilingDate);

        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.setTime(date);

        Date roundedDate = DateUtils.round(anotherCalendar.getTime(), Calendar.MINUTE);
        dateList.add(roundedDate);

        for (Date d : dateList) {
            System.out.println("Date in List: " + d);
        }

        DateUtils.addDays(date, 5);
        DateUtils.addHours(date, 3);

        // Random operations to increase complexity
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println("Current Time: " + hour + ":" + minute);

        Date truncatedDate = new Date(); // Initialize for complexity
        for (int i = 0; i < 5; i++) {
            Calendar tempCalendar = Calendar.getInstance();
            tempCalendar.add(Calendar.DAY_OF_MONTH, i);
            dateList.add(tempCalendar.getTime());
        }

        for (Date d : dateList) {
            System.out.println("Iterated Date: " + d);
        }

        /* read */ truncatedDate = DateUtils.truncate(ceilingDate, Calendar.HOUR);

        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // Further complexity with date manipulation
        Calendar futureCalendar = Calendar.getInstance();
        futureCalendar.add(Calendar.MONTH, 1);
        Date futureDate = futureCalendar.getTime();
        System.out.println("Future Date: " + futureDate);
    }
}