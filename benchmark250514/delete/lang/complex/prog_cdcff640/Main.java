import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date tomorrow = calendar.getTime();
        
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(date);
        dateList.add(tomorrow);
        
        for (Date d : dateList) {
            System.out.println("Original Date: " + d);
        }
        
        /* write */ Date updatedDate = DateUtils.setHours(date, 10);
        
        calendar.setTime(updatedDate);
        calendar.add(Calendar.HOUR_OF_DAY, 5);
        Date laterToday = calendar.getTime();
        
        dateList.add(laterToday);
        
        for (Date d : dateList) {
            System.out.println("Modified Date: " + d);
        }
        
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.MILLIS_PER_DAY);
        System.out.println("Truncated Date: " + truncatedDate);
        
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MONTH, 1);
        Date nextMonth = calendar.getTime();
        
        dateList.add(nextMonth);
        
        for (Date d : dateList) {
            System.out.println("Date List Entry: " + d);
        }
        
        Date earliestDate = dateList.get(0);
        for (Date d : dateList) {
            if (d.before(earliestDate)) {
                earliestDate = d;
            }
        }
        
        System.out.println("Earliest Date: " + earliestDate);
    }
}