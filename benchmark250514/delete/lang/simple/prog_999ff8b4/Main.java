import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ date = DateUtils.setHours(date, 10);
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.HOUR_OF_DAY);
        System.out.println(truncatedDate);
    }
}