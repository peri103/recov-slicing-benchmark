import java.util.Date;

public class Student {
    private String name;
    private DateOperations dateOps;

    public Student(String name, Date date) {
        this.name = name;
        this.dateOps = new DateOperations(date);
    }

    public Date performDateOperation(int yearsToAdd) {
        Date newDate = dateOps.addYearsToDate(yearsToAdd);
        return dateOps.truncateDate(newDate);
    }

    public String getName() {
        return name;
    }
}