public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        student1.addScore("Algebra", 85);
        student2.addScore("Geometry", 90);

        Student retrievedStudent = course.getStudent("Alice");
        if (retrievedStudent != null) {
            /* read */ int score = retrievedStudent.getScore("Algebra");
            System.out.println("Score of " + retrievedStudent.getName() + " in Algebra: " + score);
        }

        retrievedStudent = course.getStudent("Bob");
        if (retrievedStudent != null) {
            int score = retrievedStudent.getScore("Geometry");
            System.out.println("Score of " + retrievedStudent.getName() + " in Geometry: " + score);
        }
    }
}