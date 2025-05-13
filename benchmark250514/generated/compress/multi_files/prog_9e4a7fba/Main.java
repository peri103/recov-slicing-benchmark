public class Main {
    public static void main(String[] args) {
        TarEntryManager manager = new TarEntryManager("dummyEntry");
        manager.setGroupName("myGroup");

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        course.addStudent(student1);
        course.addStudent(student2);

        course.listStudents();

        /* read */ String groupName = manager.getGroupName();
        System.out.println("Group Name: " + groupName);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}