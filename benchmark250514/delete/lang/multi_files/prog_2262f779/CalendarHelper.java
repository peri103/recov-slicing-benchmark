import java.util.Calendar;
import java.util.Date;

public class CalendarHelper {
    public static Date addHours(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, hours);
        return calendar.getTime();
    }

    public static Date addSeconds(Date date, int seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, seconds);
        return calendar.getTime();
    }

    public static Date truncateToHour(Date date) {
        return DateUtils.truncate(date, Calendar.HOUR_OF_DAY);
    }
}