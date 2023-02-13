public class BlockedThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread started");
        commonResource();
    }

    public static synchronized void commonResource(){
        while(true){

        }
    }
}
