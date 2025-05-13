import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ Date newDate = DateUtils.addYears(date, 5);
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, java.util.Calendar.YEAR);
        System.out.println(truncatedDate);
    }
}