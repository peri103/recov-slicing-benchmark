import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        ArrayList<Date> datesList = new ArrayList<>();
        datesList.add(date);
        
        calendar.add(Calendar.HOUR, 1);
        Date oneHourLater = calendar.getTime();
        datesList.add(oneHourLater);
        
        /* write */ Date newDate = DateUtils.addMinutes(date, 30);
        
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date nextDay = calendar.getTime();
        datesList.add(nextDay);
        
        for (Date d : datesList) {
            System.out.println("Date in list: " + d);
        }
        
        calendar.add(Calendar.MONTH, 1);
        Date nextMonth = calendar.getTime();
        datesList.add(nextMonth);
        
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.MINUTE);
        
        System.out.println("Truncated Date: " + truncatedDate);
        
        calendar.add(Calendar.YEAR, 1);
        Date nextYear = calendar.getTime();
        datesList.add(nextYear);
        
        for (Date d : datesList) {
            System.out.println("Updated Date in list: " + d);
        }
        
        Date current = datesList.get(0);
        System.out.println("Original Date: " + current);
    }
}