import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        int monthsToAdd = 3;

        /* write */ Date newDate = DateUtils.addMonths(date, monthsToAdd);
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.MONDAY);

        System.out.println(truncatedDate);
    }
}