package machineCoding.downloadManager;

import java.io.*;
import java.net.*;

public class DownloadTask implements Runnable {
    private String url;
    private String destination;
    private DownloadState state;
    private int progress;
    private long totalSize;
    private long downloadedSize;

    public DownloadTask(String url, String destination) {
        this.url = url;
        this.destination = destination;
        this.state = DownloadState.QUEUED;
    }

    @Override
    public void run() {
        try {
            state = DownloadState.RUNNING;
            HttpDownloader downloader = new HttpDownloader(url, downloadedSize);
            byte[] data = downloader.downloadChunk();

            FileDownloader fileWriter = new FileDownloader(destination);
            fileWriter.saveToFile(data, downloadedSize);

            downloadedSize += data.length;
            progress = (int) ((downloadedSize * 100) / totalSize);

            if (downloadedSize >= totalSize) {
                state = DownloadState.COMPLETED;
            }
        } catch (Exception e) {
            state = DownloadState.PAUSED; // Handle retries or errors
        }
    }

    public void pause() {
        state = DownloadState.PAUSED;
    }

    public void resume() {
        state = DownloadState.RUNNING;
    }

    public void cancel() {
        state = DownloadState.CANCELED;
    }

    public int getProgress() {
        return progress;
    }

    public String getUrl() {
        return url;
    }
}
