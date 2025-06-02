package threads;

public class BackupThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("[Backup] Auto-saving data...");
            try {
                Thread.sleep(60000); // Every 60 sec
            } catch (InterruptedException e) {
                System.out.println("Backup interrupted");
                return;
            }
        }
    }
}
