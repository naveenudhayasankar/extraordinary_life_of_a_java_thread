public class WaitingThread implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            ie.printStackTrace();
        }
        // Since the main thread t is waiting on t2 to finish, t's state will be WAITING
        System.out.println(RunWaitingThread.t.getState());
    }
}
