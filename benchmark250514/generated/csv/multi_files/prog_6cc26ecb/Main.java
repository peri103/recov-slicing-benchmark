public class Main {
    public static void main(String[] args) {
        // Using CSVWriter to write a comment
        CSVWriter csvWriter = new CSVWriter();
        csvWriter.writeComment("This is a test comment");

        // Perform unrelated operations to make the program more complex
        Course course = new Course("Computer Science");
        course.addStudent("Alice");
        course.addStudent("Bob");
        for (String student : course.getStudents()) {
            System.out.println("Enrolled student: " + student);
        }

        // Using CSVReader to read the comment
        CSVReader csvReader = new CSVReader(csvWriter.getWrittenData());
        String comment = csvReader.readComment();
        System.out.println("Read comment: " + comment);
    }
}