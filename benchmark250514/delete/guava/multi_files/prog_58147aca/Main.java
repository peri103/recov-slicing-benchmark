public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        mathCourse.addScore("Alice", "Midterm", 85);
        mathCourse.addScore("Bob", "Midterm", 90);
        
        Integer aliceScore = mathCourse.getScore("Alice", "Midterm");
        /* read */ System.out.println("Alice's Midterm Score: " + aliceScore);

        Integer bobScore = mathCourse.getScore("Bob", "Midterm");
        System.out.println("Bob's Midterm Score: " + bobScore);
    }
}