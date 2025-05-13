import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Date> attendanceDates = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addAttendanceDate(Date date) {
        attendanceDates.add(date);
    }

    public List<Date> getAttendanceDates() {
        return attendanceDates;
    }

    public String getName() {
        return name;
    }
}
