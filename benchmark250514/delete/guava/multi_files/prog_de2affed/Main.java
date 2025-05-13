import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Create a course and add student scores
        Course mathCourse = new Course("Mathematics");
        mathCourse.addStudentScore(student1.getName(), 85);
        mathCourse.addStudentScore(student2.getName(), 90);

        // Build the student scores map
        ImmutableBiMap<String, Integer> mathScores = mathCourse.getStudentScores();

        // Display course information
        System.out.println("Course: " + mathCourse.getCourseName());

        // Perform some unrelated operations
        ImmutableList.Builder<String> fruitsBuilder = ImmutableList.builder();
        fruitsBuilder.add("apple");
        fruitsBuilder.add("banana");
        fruitsBuilder.add("cherry");
        ImmutableList<String> fruits = fruitsBuilder.build();

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Read a specific student's score
        /* read */ Integer aliceScore = mathScores.get(student1.getName());
        
        // Output the read score
        System.out.println("Alice's score in " + mathCourse.getCourseName() + ": " + aliceScore);
    }
}