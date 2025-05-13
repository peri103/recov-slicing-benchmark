public class Main {
    public static void main(String[] args) {
        // CSV Comment Writer and Reader
        CSVCommentWriter writer = new CSVCommentWriter();
        writer.writeComment("This is a comment");
        
        // Unrelated code: Student and Courses
        Student student = new Student("Alice");
        student.addCourse("Mathematics");
        student.addCourse("Science");
        
        for (String course : student.getCourses()) {
            System.out.println(student.getName() + " is enrolled in " + course);
        }
        
        // Read the comment
        CSVCommentReader reader = new CSVCommentReader();
        String comment = reader.readComment(writer.getCSVData());
        System.out.println("Comment from CSV: " + comment);
        
        // Close the writer
        writer.close();
    }
}