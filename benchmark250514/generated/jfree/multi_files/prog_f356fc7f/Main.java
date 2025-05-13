import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        // Create a PeriodManager and set the first period
        PeriodManager periodManager = new PeriodManager();
        Day firstDay = new Day(1, 1, 2023);
        periodManager.setFirstPeriod(firstDay);

        // Create students and courses
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        math.addStudent(alice);
        math.addStudent(bob);

        science.addStudent(alice);

        // Display information
        for (Course course : alice.getCourses()) {
            System.out.println(alice.getName() + " is enrolled in " + course.getCourseName());
        }

        for (Student student : math.getStudents()) {
            System.out.println(student.getName() + " is in the " + math.getCourseName() + " course");
        }

        // Retrieve the first period
        /* read */ Day retrievedDay = periodManager.getFirstPeriod();
        System.out.println("Retrieved Day: " + retrievedDay);
    }
}