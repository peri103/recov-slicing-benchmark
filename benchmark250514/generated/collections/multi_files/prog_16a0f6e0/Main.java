public class Main {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.storeValue("key", 42);

        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        Course course = new Course("Computer Science");
        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        /* read */ int value = dataStore.retrieveValue("key");
        System.out.println("Retrieved Value: " + value);
    }
}