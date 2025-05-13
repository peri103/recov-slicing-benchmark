import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        /* write */ Date dateWithAddedHours = DateUtils.addHours(currentDate, 5);
        /* read */ Date truncatedDate = DateUtils.truncate(dateWithAddedHours, java.util.Calendar.HOUR);
        System.out.println(truncatedDate);
    }
}