package Module3.Q10;

class FileDownloader extends Thread {

    private volatile boolean downloading = true;

    public void run() {

        int chunk = 1;

        while (downloading) {

            System.out.println("Downloading chunk " + chunk);

            chunk++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Download interrupted.");
                break;
            }
        }

        System.out.println("Download stopped gracefully.");
    }

    public void stopDownload() {
        downloading = false;
    }
}

public class GracefulFileDownload {

    public static void main(String[] args) {

        FileDownloader downloader = new FileDownloader();

        downloader.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Stop the download
        downloader.stopDownload();

        System.out.println("Stop request sent.");
    }
}