import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        int year = 2025;

        /* write */ Date updatedDate = DateUtils.setYears(date, year);
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.YEAR);

        System.out.println(truncatedDate);
    }
}