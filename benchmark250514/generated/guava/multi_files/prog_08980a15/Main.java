import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Create a CustomSetBuilder and add an element
        CustomSetBuilder setBuilder = new CustomSetBuilder();
        setBuilder.addElement(42);

        // Build the set
        ImmutableSortedSet<Integer> set = setBuilder.buildSet();

        // Create a CustomSetReader to check if the set contains the element
        CustomSetReader setReader = new CustomSetReader(set);
        boolean containsValue = setReader.containsElement(42);
        System.out.println("Set contains 42: " + containsValue);

        // Create students and a course
        Student alice = new Student("Alice");
        alice.addScore(85);
        alice.addScore(90);

        Student bob = new Student("Bob");
        bob.addScore(78);
        bob.addScore(82);

        Course mathCourse = new Course("Mathematics");
        mathCourse.addStudent(alice);
        mathCourse.addStudent(bob);

        // Print course details
        System.out.println("Course: " + mathCourse.getCourseName());
        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }
    }
}