import org.apache.commons.collections4.set.ListOrderedSet;

public class Course {
    private ListOrderedSet<String> topics = ListOrderedSet.listOrderedSet(new java.util.HashSet<>());

    public void addTopic(String topic) {
        /* write */ topics.add(topic);
    }

    public String getFirstTopic() {
        return topics.get(0);
    }

    public ListOrderedSet<String> getAllTopics() {
        return topics;
    }
}
