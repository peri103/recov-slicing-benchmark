public class Main {
    public static void main(String[] args) {
        String csvData = "name,age\nJohn,30\nDoe,25";
        
        CSVProcessor processor = new CSVProcessor();
        processor.processCSV(csvData);
        
        // Additional unrelated data structures
        Student student = new Student("Alice", 28);
        student.addCourse("Math", 95);
        student.addCourse("Science", 88);
        
        System.out.println(student);
    }
}
