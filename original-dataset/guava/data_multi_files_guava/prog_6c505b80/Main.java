import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMapWrapper biMapWrapper = new ImmutableBiMapWrapper();
        biMapWrapper.addEntry("key1", 100);
        ImmutableBiMap<String, Integer> biMap = biMapWrapper.build();

        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        student.addScore(90);
        course.addStudent(student);

        // Retrieving scores
        for (Student s : course.getStudents()) {
            System.out.println("Student Name: " + s.name);
            System.out.println("Score: " + s.getScores().get(0));
        }

        /* read */ int value = biMap.get("key1");
        System.out.println("Value retrieved from ImmutableBiMap: " + value);
    }
}