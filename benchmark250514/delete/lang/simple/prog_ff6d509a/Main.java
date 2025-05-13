import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        /* write */ Date updatedDate = DateUtils.setWeeks(date, 10);
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.WEEK_OF_YEAR);
        System.out.println(truncatedDate);
    }
}