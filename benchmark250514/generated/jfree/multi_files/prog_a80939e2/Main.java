public class Main {
    public static void main(String[] args) {
        DateAxisManager dateAxisManager = new DateAxisManager();
        dateAxisManager.setDateFormat("yyyy-MM-dd");

        AxisInformation axisInfo = new AxisInformation(dateAxisManager);
        String dateFormatPattern = axisInfo.getDateFormatPattern();
        System.out.println("Date format pattern: " + dateFormatPattern);

        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }
    }
}