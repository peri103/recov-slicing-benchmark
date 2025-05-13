public class Main {
    public static void main(String[] args) {
        // Configure CSV format
        CSVConfig csvConfig = new CSVConfig();
        csvConfig.configureFormat();

        // Handle CSV record
        CSVRecordHandler recordHandler = new CSVRecordHandler(csvConfig.getFormat());
        boolean isMapped = recordHandler.checkMapping("header");
        System.out.println("Is header mapped: " + isMapped);

        // Student operations
        Student student = new Student("John Doe");
        student.addSubject("Math");
        student.addSubject("Science");
        student.setGrade("Math", 90);
        student.setGrade("Science", 85);

        // Print student grades
        student.printGrades();
    }
}