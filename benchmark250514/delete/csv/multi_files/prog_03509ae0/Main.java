public class Main {
    public static void main(String[] args) {
        // CSV Configuration and Data
        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.configureFormat();
        CSVData csvData = new CSVData(csvConfig.getCsvFormat());
        boolean isMapped = csvData.checkMapping("name");
        System.out.println("Is 'name' mapped: " + isMapped);
        csvData.printRecord();

        // Student and Course example
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        Course course = new Course("Computer Science");
        course.addStudent(student1);
        course.addStudent(student2);
        course.printStudents();
    }
}