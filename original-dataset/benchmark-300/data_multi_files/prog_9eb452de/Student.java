import java.util.Stack;

public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void addData(int data) {
        dataManager.addData(data);
    }

    public Stack getStack() {
        return dataManager.getStack();
    }
}
