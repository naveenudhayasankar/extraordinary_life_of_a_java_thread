public class Main {
    public static void main(String[] args){
        // New Thread
        Runnable newThread = new NewState();
        Thread t = new Thread(newThread);
        System.out.println(t.getState());
        System.out.println("**********************");
        // Runnable Thread
        t.start();
        System.out.println(t.getState());
        System.out.println("**********************");
        // Blocked Thread
        try {
            RunBlockedThread.runThread();
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("**********************");
        RunWaitingThread.runWaitingThread();
        System.out.println("**********************");
        try {
            RunTimedWaitingThread.runThread();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("**********************");
        try {
            TerminatedThread.runThread();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
