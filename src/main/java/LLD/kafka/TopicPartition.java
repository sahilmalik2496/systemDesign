package LLD.kafka;

import java.util.LinkedList;
import java.util.Queue;

class TopicPartition {
    private String topicName;
    private int partitionId;
    private Queue<String> messagesQueue;

    public TopicPartition(String topicName, int partitionId) {
        this.topicName = topicName;
        this.partitionId = partitionId;
        this.messagesQueue = new LinkedList<>();
    }

    public void addMessage(String message) {
        messagesQueue.offer(message);
    }

    public String getMessage() {
        return messagesQueue.poll(); // Fetch next message
    }
}

