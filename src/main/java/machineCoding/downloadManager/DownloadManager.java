package machineCoding.downloadManager;

import java.util.*;
import java.util.concurrent.*;

public class DownloadManager {
    private List<DownloadTask> tasks;
    private ExecutorService executor;

    public DownloadManager(int maxThreads) {
        tasks = new ArrayList<>();
        executor = Executors.newFixedThreadPool(maxThreads);
    }

    public void startDownload(String url, String destination) {
        DownloadTask task = new DownloadTask(url, destination);
        tasks.add(task);
        executor.submit(task);
    }

    public void pauseDownload(String url) {
        tasks.stream()
                .filter(task -> task.getUrl().equals(url))
                .findFirst()
                .ifPresent(DownloadTask::pause);
    }

    public void resumeDownload(String url) {
        tasks.stream()
                .filter(task -> task.getUrl().equals(url))
                .findFirst()
                .ifPresent(task -> executor.submit(task));
    }

    public void cancelDownload(String url) {
        tasks.stream()
                .filter(task -> task.getUrl().equals(url))
                .findFirst()
                .ifPresent(DownloadTask::cancel);
    }

    public int getDownloadProgress(String url) {
        return tasks.stream()
                .filter(task -> task.getUrl().equals(url))
                .mapToInt(DownloadTask::getProgress)
                .findFirst()
                .orElse(0);
    }
}
