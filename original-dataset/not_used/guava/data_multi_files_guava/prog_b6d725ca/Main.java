public class Main {
    public static void main(String[] args) {
        RangeMapManager rangeMapManager = new RangeMapManager();
        rangeMapManager.addRange(1, 5, "Value1");

        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        course.addStudent(student);

        /* read */ String value = rangeMapManager.getValue(3);
        System.out.println(value);
    }
}