import java.util.List;

public class Main {
    public static void main(String[] args) {
        GzipWrapper gzipWrapper = new GzipWrapper();
        byte[] extraData = {0x01, 0x02, 0x03};
        gzipWrapper.setExtraData(extraData);

        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student2.addScore(90);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            List<Integer> scores = student.getScores();
            for (int score : scores) {
                System.out.println("Score: " + score);
            }
        }

        /* read */ byte[] readExtraData = gzipWrapper.getExtraData();
        System.out.print("Extra Data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}