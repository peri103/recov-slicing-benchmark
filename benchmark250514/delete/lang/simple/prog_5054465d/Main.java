import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ Date modifiedDate = DateUtils.addHours(date, 5);
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.HOUR_OF_DAY);
        System.out.println(truncatedDate);
    }
}