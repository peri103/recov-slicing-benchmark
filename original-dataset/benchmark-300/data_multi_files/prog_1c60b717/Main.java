import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();
        dataStorage.storeData("studentScore", 95);

        Student student = new Student("John Doe");
        student.addScore(85);
        student.addScore(90);

        LinkedList<String> messages = new LinkedList<>();
        messages.add("Welcome to the system!");
        messages.add("Your scores are being processed.");

        for (String message : messages) {
            System.out.println(message);
        }

        /* read */ Integer score = dataStorage.retrieveData("studentScore");
        System.out.println("Retrieved score: " + score);

        System.out.println("Student: " + student.getName());
        for (int s : student.getScores()) {
            System.out.println("Score: " + s);
        }

        ArrayList<Integer> additionalScores = new ArrayList<>();
        additionalScores.add(88);
        additionalScores.add(92);

        for (int s : additionalScores) {
            System.out.println("Additional score: " + s);
        }
    }
}