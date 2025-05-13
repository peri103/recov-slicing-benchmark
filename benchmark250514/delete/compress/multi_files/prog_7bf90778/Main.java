public class Main {
    public static void main(String[] args) {
        LinkEntry linkEntry = new LinkEntry();
        linkEntry.setLink("exampleLink");

        // Create students and a course
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        alice.addGrade(85);
        alice.addGrade(90);
        bob.addGrade(78);
        bob.addGrade(82);

        Course course = new Course("Mathematics");
        course.addStudent(alice);
        course.addStudent(bob);

        // Output top student
        Student topStudent = course.getTopStudent();
        System.out.println("Top student in " + course.getCourseName() + ": " + topStudent.getName());

        // Read link name
        /* read */ String linkName = linkEntry.getLink();
        System.out.println("Link Name: " + linkName);
    }
}