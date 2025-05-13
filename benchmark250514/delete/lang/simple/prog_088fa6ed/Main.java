import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ Date newDate = DateUtils.addSeconds(date, 10);
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.SECOND);
        System.out.println(truncatedDate);
    }
}