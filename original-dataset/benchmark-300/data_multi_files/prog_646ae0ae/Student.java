public class Student {
    private String name;
    private CopyOnWriteArrayList<String> notes = new CopyOnWriteArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addNote(String note) {
        /* write */ notes.add(note);
    }

    public CopyOnWriteArrayList<String> getNotes() {
        return notes;
    }

    public String getName() {
        return name;
    }
}
