public class Main {
    public static void main(String[] args) {
        RangeMapUtil rangeMapUtil = new RangeMapUtil();
        rangeMapUtil.addRange(1, 10, "Value in range 1-10");

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course details
        System.out.println("Course: " + course.getStudents().size() + " students enrolled.");

        /* read */ String value = rangeMapUtil.getValue(5); // This value is retrieved from the range
        System.out.println(value);
    }
}