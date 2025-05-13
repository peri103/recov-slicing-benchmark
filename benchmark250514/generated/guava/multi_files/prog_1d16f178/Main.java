public class Main {
    public static void main(String[] args) {
        CustomMap customMap = new CustomMap();
        customMap.putValue("key", 42);

        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student2.addGrade(90);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Performing some unrelated logic
        int totalGrades = 0;
        for (Student student : course.getStudents()) {
            for (int grade : student.getGrades()) {
                totalGrades += grade;
            }
        }
        System.out.println("Total grades: " + totalGrades);

        // Reading the value from CustomMap
        /* read */ int value = customMap.getValue("key");
        System.out.println("Value from CustomMap: " + value);
    }
}