public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Java Programming", student);

        // Enroll student and add data
        course.enrollStudent(100);
        course.enrollStudent(200);

        // Retrieve and print data
        LinkedList<Integer> dataList = course.getStudentData();
        /* read */ int value = dataList.get(0);
        System.out.println("Value read from LinkedList: " + value);

        // Print all data
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println("Data at index " + i + ": " + dataList.get(i));
        }
    }
}