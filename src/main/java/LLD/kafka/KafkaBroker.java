package LLD.kafka;

import java.util.HashMap;
import java.util.Map;

class KafkaBroker {
    private int brokerId;
    private Map<String, TopicPartition> partitions;

    public KafkaBroker(int brokerId) {
        this.brokerId = brokerId;
        this.partitions = new HashMap<>();
    }

    public void registerTopic(String topic, int partitionId) {
        partitions.put(topic, new TopicPartition(topic, partitionId));
    }

    public void storeMessage(String topic, String message) {
        if (partitions.containsKey(topic)) {
            partitions.get(topic).addMessage(message);
        }
    }

    public String consumeMessage(String topic) {
        return partitions.containsKey(topic) ? partitions.get(topic).getMessage() : null;
    }
}

