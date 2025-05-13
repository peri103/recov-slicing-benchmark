import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        /* write */ Date modifiedDate = DateUtils.addMonths(currentDate, 1);
        
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.MONTH);
        
        System.out.println(truncatedDate);
    }
}