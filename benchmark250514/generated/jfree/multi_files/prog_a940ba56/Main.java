public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        student1.setPlotMaxLabelWidth(0.3);
        student2.setPlotMaxLabelWidth(0.4);

        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Course: " + mathCourse.getCourseName());
            /* read */ double maxLabelWidth = student.getPlotMaxLabelWidth();
            System.out.println("Maximum Label Width: " + maxLabelWidth);
        }
    }
}