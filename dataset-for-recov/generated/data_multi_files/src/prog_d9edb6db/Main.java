public class Main {
    public static void main(String[] args) {
        // Create a CustomSet instance and add elements
        CustomSet customSet = new CustomSet();
        customSet.addElement(10);
        customSet.addElement(20);
        customSet.addElement(30);

        // Create a Course and add Students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student2.addGrade(90);

        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Check if a specific element exists in the CustomSet
        /* read */ boolean containsValue = customSet.containsElement(10);
        System.out.println("CustomSet contains 10: " + containsValue);
    }
}