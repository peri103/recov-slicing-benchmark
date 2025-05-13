import com.google.common.collect.ImmutableRangeSet;

public class Main {
    public static void main(String[] args) {
        // Create a RangeSetBuilder and add a range
        RangeSetBuilder rangeSetBuilder = new RangeSetBuilder();
        rangeSetBuilder.addRange(1, 10);
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = rangeSetBuilder.build();
        
        // Create a RangeSetChecker with the built range set
        RangeSetChecker rangeSetChecker = new RangeSetChecker(rangeSet);
        
        // Check if a value is contained in the range set
        boolean containsValue = rangeSetChecker.contains(5);
        
        // Print the result
        System.out.println("Contains 5 in original rangeSet: " + containsValue);
        
        // Create a course and add students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        course.addStudent(alice);
        course.addStudent(bob);
        
        // Print the students in the course
        for (Student student : course.getStudents()) {
            System.out.println("Student in course: " + student.getName());
        }
    }
}