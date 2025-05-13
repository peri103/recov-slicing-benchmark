import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a course and add students
            Course course = new Course("Computer Science");
            course.addStudent(new Student("John Doe", 20));
            course.addStudent(new Student("Alice Smith", 22));

            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }

            // Handle CSV data
            CSVHandler csvHandler = new CSVHandler();
            String csvData = "name,age\nJohn,30\n\nAlice,25";
            csvHandler.parseCSV(csvData);

            // Retrieve and display consistent records
            for (CSVRecord record : csvHandler.getConsistentRecords()) {
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Consistent Record: " + record + ", Is Consistent: " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}