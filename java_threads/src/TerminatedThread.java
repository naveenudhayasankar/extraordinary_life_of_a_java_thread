public class TerminatedThread implements Runnable{
    public static void runThread() throws InterruptedException{
        Thread t = new Thread(new TerminatedThread());
        t.start();
        Thread.sleep(1000);
        // If a thread has finished running, it will be in TERMINATED state
        System.out.println(t.getState());
    }
    @Override
    public void run() {

    }
}
