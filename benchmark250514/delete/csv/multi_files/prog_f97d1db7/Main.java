public class Main {
    public static void main(String[] args) {
        // Configure CSV format
        CSVConfig csvConfig = new CSVConfig();
        csvConfig.configureFormat();

        // Create CSV data and check consistency
        CSVData csvData = new CSVData(new String[]{"value1", "value2"});
        boolean isConsistent = csvData.checkConsistency();
        System.out.println("Is CSV Data consistent: " + isConsistent);

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        course.addStudent(student1);
        course.addStudent(student2);

        // Display student details
        for (Student student : course.getStudents()) {
            System.out.println(student.getDetails());
        }
    }
}