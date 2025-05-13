public class Student {
    private String name;
    private MutableBooleanWrapper enrollmentStatus;

    public Student(String name) {
        this.name = name;
        this.enrollmentStatus = new MutableBooleanWrapper();
    }

    public void enroll() {
        enrollmentStatus.setBooleanValue(true);
    }

    public boolean isEnrolled() {
        return enrollmentStatus.getBooleanValue();
    }

    public String getName() {
        return name;
    }
}
