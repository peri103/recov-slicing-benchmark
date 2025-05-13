import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.addHeaderComment("This is a comment");

        try {
            csvHandler.writeCSV();
            String csvContent = csvHandler.getCSVContent();

            CSVReader csvReader = new CSVReader(CSVFormat.DEFAULT);
            String comment = csvReader.readComment(csvContent);
            System.out.println(comment);

            // Additional unrelated operations
            Student student = new Student("John Doe", 12345);
            student.enrollInCourse(new Course("Math 101", 3));
            student.enrollInCourse(new Course("History 101", 4));
            student.printCourses();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
