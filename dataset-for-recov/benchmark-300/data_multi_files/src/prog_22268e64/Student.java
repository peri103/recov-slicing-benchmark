public class Student {
    private String name;
    private LinkedListOperations linkedListOps = new LinkedListOperations();

    public Student(String name) {
        this.name = name;
    }

    public void addFirstToList(int value) {
        linkedListOps.addFirst(value);
    }

    public int getFirstFromList() {
        return linkedListOps.getFirst();
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedListOps.getList();
    }
}
