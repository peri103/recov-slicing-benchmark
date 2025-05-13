public class Student {
    private String name;
    private StrBuilderWrapper notes;

    public Student(String name, String initialNotes) {
        this.name = name;
        this.notes = new StrBuilderWrapper(initialNotes);
    }

    public void clearNotes() {
        notes.clearContent();
    }

    public void addNotes(String additionalNotes) {
        notes.appendContent(additionalNotes);
    }

    public String getNotes() {
        return notes.getContent();
    }

    public String getName() {
        return name;
    }
}
