import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        
        Date date = calendar.getTime();
        
        /* write */ date = DateUtils.setWeeks(date, 10);
        
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR);
        
        System.out.println(truncatedDate);
    }
}