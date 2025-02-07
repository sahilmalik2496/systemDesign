package LLD.kafka;

class Producer {
    private int producerId;
    private KafkaBroker broker;

    public Producer(int producerId, KafkaBroker broker) {
        this.producerId = producerId;
        this.broker = broker;
    }

    public void send(String topic, String message) {
        System.out.println("Producer " + producerId + " sending: " + message);
        broker.storeMessage(topic, message);
    }
}
