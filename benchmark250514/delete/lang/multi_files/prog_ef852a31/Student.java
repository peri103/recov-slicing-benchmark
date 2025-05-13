public class Student {
    private String name;
    private CustomDateHandler enrollmentDateHandler;

    public Student(String name, Date enrollmentDate) {
        this.name = name;
        this.enrollmentDateHandler = new CustomDateHandler(enrollmentDate);
    }

    public void addWeeksToEnrollmentDate(int weeks) {
        enrollmentDateHandler.addWeeks(weeks);
    }

    public Date getEnrollmentDate() {
        return enrollmentDateHandler.getDate();
    }
}
