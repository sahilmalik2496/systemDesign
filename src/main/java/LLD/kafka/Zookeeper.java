package LLD.kafka;

import java.util.ArrayList;
import java.util.List;

class Zookeeper {
    private List<KafkaBroker> brokersList;

    public Zookeeper() {
        brokersList = new ArrayList<>();
    }

    public void registerBroker(KafkaBroker broker) {
        brokersList.add(broker);
        System.out.println("Broker " + broker + " registered");
    }

    public KafkaBroker getLeader() {
        return brokersList.get(0); // Simple leader election
    }
}
