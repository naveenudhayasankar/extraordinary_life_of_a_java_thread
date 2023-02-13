public class RunWaitingThread implements Runnable{
    public static Thread t;

    public static void runWaitingThread(){
        t = new Thread(new RunWaitingThread());
        t.start();
    }

    @Override
    public void run() {
        // Thread t creates a new thread t2 and starts it.
        Thread t2 = new Thread(new WaitingThread());
        t2.start();

        try {
            // When t calls join() on t2, t will wait until t2 is finished.
            t2.join();
        } catch (InterruptedException ie){
            Thread.currentThread().interrupt();
            ie.printStackTrace();
        }
    }
}
