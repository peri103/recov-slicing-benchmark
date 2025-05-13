public class Main {
    public static void main(String[] args) {
        MutableLongWrapper longWrapper = new MutableLongWrapper();
        longWrapper.setValue(12345L);

        // Create students and add grades
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(82);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Read the value from the MutableLongWrapper
        /* read */ long value = longWrapper.getValue();
        System.out.println("MutableLong Value: " + value);
    }
}