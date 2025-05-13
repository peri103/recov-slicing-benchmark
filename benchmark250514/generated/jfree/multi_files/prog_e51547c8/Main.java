public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        student1.setStepPoint(0.5);
        student2.setStepPoint(0.7);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            /* read */ double stepPoint = student.getStepPoint();
            System.out.println("Step Point: " + stepPoint);
        }
    }
}