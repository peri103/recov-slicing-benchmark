import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create and build the custom map
        CustomMapBuilder mapBuilder = new CustomMapBuilder();
        mapBuilder.addStringInstance("Hello World");
        ImmutableClassToInstanceMap<Object> map = mapBuilder.build();

        // Read from the custom map
        CustomMapReader mapReader = new CustomMapReader(map);
        String value = mapReader.getStringInstance();
        System.out.println(value);

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);
        student.enrollCourse(math);
        student.enrollCourse(science);

        // Display student information
        System.out.println("Student: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Enrolled in: " + course.getCourseName() + " for " + course.getCredits() + " credits");
        }
    }
}