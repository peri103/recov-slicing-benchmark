import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ date = DateUtils.setHours(date, 15);
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.SEMI_MONTH);
        System.out.println(truncatedDate);
    }
}