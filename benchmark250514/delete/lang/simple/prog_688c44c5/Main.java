import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ date = DateUtils.setMinutes(date, 30);
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.MILLIS_IN_MINUTE);
        System.out.println(truncatedDate);
    }
}