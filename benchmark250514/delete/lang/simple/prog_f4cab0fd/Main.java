import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Date updatedDate;
        
        /* write */ updatedDate = DateUtils.setYears(date, 2023);
        
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.YEAR);
        
        System.out.println(truncatedDate);
    }
}