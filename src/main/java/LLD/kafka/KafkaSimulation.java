package LLD.kafka;

public class KafkaSimulation {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        KafkaBroker broker1 = new KafkaBroker(1);
        zookeeper.registerBroker(broker1);

        broker1.registerTopic("my-topic", 1);

        Producer producer = new Producer(100, broker1);
        Consumer consumer = new Consumer(200, "my-topic", broker1);

        consumer.subscribe();

        producer.send("my-topic", "Hello Kafka!");
        producer.send("my-topic", "This is a message queue!");

        consumer.consume();
        consumer.consume();
    }
}
