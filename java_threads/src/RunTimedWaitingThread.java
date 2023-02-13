public class RunTimedWaitingThread {
    public static void runThread() throws InterruptedException {
        Thread t = new Thread(new TimedWaitingThread());
        t.start();
        // Similar to WAITING state but the waiting thread returns after a specified amount of time.
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
