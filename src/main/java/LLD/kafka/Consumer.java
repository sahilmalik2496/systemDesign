package LLD.kafka;

class Consumer {
    private int consumerId;
    private String topic;
    private KafkaBroker broker;
    private int offset = 0;

    public Consumer(int consumerId, String topic, KafkaBroker broker) {
        this.consumerId = consumerId;
        this.topic = topic;
        this.broker = broker;
    }

    public void subscribe() {
        System.out.println("Consumer " + consumerId + " subscribed to topic: " + topic);
    }

    public void consume() {
        String message = broker.consumeMessage(topic);
        if (message != null) {
            offset++;
            System.out.println("Consumer " + consumerId + " consumed: " + message);
        } else {
            System.out.println("No messages in topic: " + topic);
        }
    }
}
