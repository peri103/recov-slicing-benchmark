import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVHandler and configure format
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.configureFormat();

            // Write data using CSVHandler
            csvHandler.writeData("Alice", "Math", "90");
            csvHandler.writeData("Bob", "Science", "85");

            // Read data using CSVReader
            CSVReader csvReader = new CSVReader(csvHandler.getWrittenData());
            String firstRecord = csvReader.readData();
            System.out.println("First Record: " + firstRecord);

            // Create Student and Course objects
            Student alice = new Student("Alice");
            alice.addCourse("Math");
            alice.addCourse("Science");

            Student bob = new Student("Bob");
            bob.addCourse("Science");

            Course math = new Course("Math");
            math.enrollStudent(alice);

            Course science = new Course("Science");
            science.enrollStudent(alice);
            science.enrollStudent(bob);

            // Print enrolled students for each course
            for (Student student : math.getStudents()) {
                System.out.println("Math Student: " + student.getName());
            }

            for (Student student : science.getStudents()) {
                System.out.println("Science Student: " + student.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}