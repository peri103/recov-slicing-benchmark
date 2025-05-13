public class Main {
    public static void main(String[] args) {
        // Create a CommentWriter and write a comment
        CommentWriter commentWriter = new CommentWriter();
        commentWriter.writeComment("This is a comment");

        // Create a CommentReader and read the comment
        CommentReader commentReader = new CommentReader(commentWriter.getCsvOutput());
        String comment = commentReader.readComment();
        System.out.println(comment);

        // Additional operations with Course and Student
        Course course = new Course("Java Programming");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        
        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}