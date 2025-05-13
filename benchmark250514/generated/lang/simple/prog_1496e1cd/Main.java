import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        /* write */ Date futureDate = DateUtils.addDays(currentDate, 5);
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, java.util.Calendar.DAY_OF_MONTH);
        System.out.println(truncatedDate);
    }
}