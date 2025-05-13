import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class CalendarUtils {
    public void displayMonthInfo(Month currentMonth) {
        if (currentMonth.getMonth() == 10) {
            System.out.println("It's October!");
        }
    }

    public void checkLeapYear(Year currentYear) {
        if (currentYear.isLeapYear()) {
            System.out.println("This is a leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }
    }

    public int calculateDaysBetween(Day start, Day end) {
        return end.getSerialIndex() - start.getSerialIndex();
    }
}
