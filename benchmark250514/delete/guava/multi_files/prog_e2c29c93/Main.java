public class Main {
    public static void main(String[] args) {
        // Managing ranges
        RangeManager rangeManager = new RangeManager();
        rangeManager.addRange(20, 30);
        rangeManager.addRange(40, 50);
        rangeManager.addRange(1, 10); // This is where the write happens

        ImmutableRangeSet<Integer> rangeSet = rangeManager.buildRangeSet();
        RangeChecker rangeChecker = new RangeChecker(rangeSet);

        // Checking if a value is within any of the defined ranges
        boolean containsValue = rangeChecker.contains(5); // This is where the read happens
        System.out.println("RangeSet contains 5: " + containsValue);

        // Managing students and courses
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}