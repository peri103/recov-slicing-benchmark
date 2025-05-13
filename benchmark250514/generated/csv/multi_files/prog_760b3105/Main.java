import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVWriter and write data
            CSVWriter csvWriter = new CSVWriter();
            csvWriter.writeData("Hello, World!");

            // Create a Student object and manipulate data
            Student student = new Student("John Doe");
            student.addGrade(85);
            student.addGrade(90);
            student.addGrade(78);
            System.out.println("Average grade for " + student.getName() + ": " + student.calculateAverage());

            // Read the CSV data using CSVReader
            CSVReader csvReader = new CSVReader(csvWriter.getCSVData());
            String csvOutput = csvReader.readData();
            System.out.println("CSV Output: " + csvOutput);

            // Close resources
            csvWriter.close();
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}