import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        /* write */ Date newDate = DateUtils.addSeconds(now, 3600);
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.SECOND);
        System.out.println(truncatedDate);
    }
}