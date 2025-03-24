public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        
        // Writing thread
        Thread writer = new Thread(() -> {
            student.writeScore(95);
        });
        
        // Reading thread
        Thread reader = new Thread(() -> {
            int score = student.readScore();
            System.out.println("Student " + student.getName() + " scored: " + score);
        });
        
        writer.start();
        reader.start();
        
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}