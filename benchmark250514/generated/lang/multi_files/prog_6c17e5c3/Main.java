public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        student1.addNotes("Alice's notes on calculus.");
        student2.addNotes("Bob's notes on algebra.");

        student1.adjustNotesLength(5); // Adjust length of Alice's notes

        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + "'s Notes: ");
            /* read */ String notes = student.getNotes();
            System.out.println(notes);
        }
    }
}