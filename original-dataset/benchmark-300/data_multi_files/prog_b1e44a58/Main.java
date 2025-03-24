import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(95);
        
        // Adding some initial data to list2 and list3
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        list2.add(new ArrayList<>());
        list3.add(200);
        
        // Performing some operations with list3
        int x = list3.get(0);
        System.out.println("Value from LinkedList: " + x);
        
        // Adding elements to list2
        for (ArrayList<Integer> obj : list2) {
            obj.add(2);
        }
        
        // Getting the scores from the student
        List<Integer> scores = student.getScores();
        /* read */ int score = scores.get(0);
        System.out.println("Student's score: " + score);
        
        // Creating and manipulating another ArrayList
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(i * 10);
        }
        
        // Printing elements from list4
        for (int i = 0; i < list4.size(); i++) {
            System.out.println("Element at index " + i + ": " + list4.get(i));
        }
    }
}