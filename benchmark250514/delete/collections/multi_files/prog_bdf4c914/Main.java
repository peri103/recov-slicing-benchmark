public class Main {
    public static void main(String[] args) {
        MultiKeyMapWrapper<String, String, Integer> mapWrapper = new MultiKeyMapWrapper<>();
        mapWrapper.putValue("key3", "key4", 100);
        
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        // Final read operation
        /* read */ Integer value = mapWrapper.getValue("key3", "key4");
        System.out.println("MultiKeyMap Value for (key3, key4): " + value);
    }
}