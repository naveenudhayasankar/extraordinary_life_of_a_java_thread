public class RunBlockedThread {
    public static void runThread() throws InterruptedException {
        Thread t1 = new Thread(new BlockedThread());
        Thread t2 = new Thread(new BlockedThread());

        t1.start();
        Thread.sleep(1000);
        // t1 is already using the common resource from BlockedThread, if t2 tries to access commonResource,
        // it will be blocked.
        t2.start();

        Thread.sleep(1000);

        System.out.println(t2.getState());
    }
}
