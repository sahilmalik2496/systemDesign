package machineCoding.inventoryManagement;

import java.util.concurrent.*;
import java.util.*;

public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<>();
    private final ThreadPoolExecutor executor;

    public RequestQueue(int threadPoolSize) {
        this.executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(threadPoolSize);
    }

    public synchronized void addRequest(Request request) {
        queue.offer(request);
    }

    public void processRequests(InventoryManager inventoryManager) {
        while (!queue.isEmpty()) {
            Request request = queue.poll();
            executor.execute(() -> request.execute(inventoryManager));
        }
    }

    public void shutdown() {
        executor.shutdown();
    }
}

