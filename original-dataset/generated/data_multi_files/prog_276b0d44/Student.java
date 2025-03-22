public class Student {
    private String name;
    private LinkedListManager linkedListManager = new LinkedListManager();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        linkedListManager.addToEnd(score);
    }

    public LinkedList<Integer> getScores() {
        return linkedListManager.getList();
    }
}
