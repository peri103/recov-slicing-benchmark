import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "name, age\nAlice, 30\nBob, 25";
            
            CSVHelper csvHelper = new CSVHelper();
            List<CSVRecord> records = csvHelper.parseCSV(csvData);

            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                Student student = new Student(name, age);
                
                Course course1 = new Course("Mathematics", 3);
                Course course2 = new Course("Science", 4);
                
                student.enrollInCourse(course1);
                student.enrollInCourse(course2);

                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
                for (Course course : student.getCourses()) {
                    System.out.println("Enrolled in: " + course.getCourseName() + " (" + course.getCredits() + " credits)");
                }
            }

            // Reading the first record to check if a specific column is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isNameSet = firstRecord.isSet("name");
            System.out.println("Is 'name' set in the first record? " + isNameSet);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}