public class Student {
    private String name;
    private DateManipulator dateManipulator;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.dateManipulator = new DateManipulator(birthDate);
    }

    public Date addDaysToBirthDate(int days) {
        return dateManipulator.addDays(days);
    }

    public String getName() {
        return name;
    }
}
