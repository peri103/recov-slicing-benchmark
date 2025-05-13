import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ date = DateUtils.setHours(date, 10);
        /* read */ Date truncatedDate = DateUtils.truncate(date, java.util.Calendar.HOUR);
        System.out.println(truncatedDate);
    }
}