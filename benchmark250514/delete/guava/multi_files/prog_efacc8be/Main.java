public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course();
        Student student = new Student("John", mathCourse);

        student.addGrade(95);

        ImmutableMultimap<String, Integer> grades = student.getGrades();
        /* read */ Integer grade = grades.get("John").iterator().next();
        System.out.println("John's grade in math: " + grade);

        // Additional unrelated logic
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 10: " + sum);
    }
}