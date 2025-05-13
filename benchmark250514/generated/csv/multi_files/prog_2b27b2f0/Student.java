public class Student {
    private String name;
    private CommentWriter commentWriter = new CommentWriter();

    public Student(String name) {
        this.name = name;
    }

    public void addComment(String comment) {
        commentWriter.writeComment(comment);
    }

    public String getCommentData() {
        return commentWriter.getWrittenData();
    }
}
