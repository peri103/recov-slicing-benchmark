import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        /* write */ Date newTime = DateUtils.addMinutes(now, 10);
        /* read */ Date truncatedTime = DateUtils.truncate(newTime, java.util.Calendar.MINUTE);
        System.out.println(truncatedTime);
    }
}