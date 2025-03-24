import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addData(42);
        
        // Adding more data to the student's data list
        for (int i = 1; i < 5; i++) {
            student.addData(i * 10);
        }
        
        // Printing all data from the student's data list
        LinkedList<Integer> dataList = student.getDataList();
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println("Data at index " + i + ": " + dataList.get(i));
        }
        
        /* read */ int value = dataList.getLast();
        System.out.println("Last data in the list: " + value);
        
        // Additional complex logic
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        
        for (String str : stringList) {
            System.out.println("String element: " + str);
        }
        
        // Nested loop for complexity
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nested loop: i=" + i + ", j=" + j);
            }
        }
    }
}