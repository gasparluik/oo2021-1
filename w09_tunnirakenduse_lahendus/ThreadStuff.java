public class ThreadStuff {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Threads("Üks"));
        Thread t2 = new Thread(new Threads("Teine"));
        Thread t3 = new Thread(new Threads("Kolmas"));

        t1.start();
        t2.start();
        t3.start();
    }
    
}
