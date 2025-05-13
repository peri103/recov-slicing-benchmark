public class Main {
    public static void main(String[] args) {
        School school = new School();

        // Create students and assign grades
        Student alice = new Student("Alice");
        alice.getCourse().addGrade("Math", "A");
        alice.getCourse().addGrade("Science", "B");

        Student bob = new Student("Bob");
        bob.getCourse().addGrade("Math", "B");
        bob.getCourse().addGrade("Science", "A");

        // Add students to the school
        school.addStudent(alice);
        school.addStudent(bob);

        // Retrieve and print grades for Alice
        for (Student student : school.getStudents()) {
            if (student.getName().equals("Alice")) {
                ImmutableMap<String, String> grades = student.getCourse().getGrades();
                /* read */ String mathGrade = grades.get("Math");
                System.out.println("Alice's Math Grade: " + mathGrade);
            }
        }
    }
}