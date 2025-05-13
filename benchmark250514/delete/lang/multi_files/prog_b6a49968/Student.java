public class Student {
    private String name;
    private DateManipulator dateManipulator;

    public Student(String name, Date date) {
        this.name = name;
        this.dateManipulator = new DateManipulator(date);
    }

    public Date getUpdatedDate() {
        return dateManipulator.addWeeks(1);
    }

    public Date getTruncatedDate(Date date) {
        return dateManipulator.truncateDate(date);
    }
}
