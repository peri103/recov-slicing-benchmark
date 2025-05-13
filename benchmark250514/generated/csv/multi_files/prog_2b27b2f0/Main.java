public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addComment("This is a comment");

        CommentReader commentReader = new CommentReader();
        String data = student.getCommentData();
        String comment = commentReader.readComment(data);

        System.out.println("Comment: " + comment);
    }
}