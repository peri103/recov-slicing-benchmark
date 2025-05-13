public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.enrollCourse("Science");

        Course course = student.getCourse();
        course.addGrade("Homework 1", 85);
        course.addGrade("Project", 90);

        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled in: " + course.getName());

        ImmutableBiMap<String, Integer> grades = course.getGrades();
        for (String assignment : grades.keySet()) {
            System.out.println("Assignment: " + assignment + ", Score: " + grades.get(assignment));
        }

        /* read */ Integer score = grades.get("Homework 1");
        System.out.println("The score for 'Homework 1' is: " + score);
    }
}