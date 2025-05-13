import java.util.ArrayList;
import java.util.Date;

public class DateHandler {
    private ArrayList<Date> dateList = new ArrayList<>();

    public void addDate(Date date) {
        dateList.add(date);
    }

    public ArrayList<Date> getDateList() {
        return dateList;
    }
}
