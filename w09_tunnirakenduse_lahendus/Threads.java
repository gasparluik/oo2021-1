import java.util.Random;

public class Threads implements Runnable {
    String name;
    int time;
    Random r = new Random();

public Threads(String x){
    name = x;
    time = r.nextInt(999);
}
@Override
public void run(){
    try {
        System.out.printf("%s  magab nii palju  %d\n", name, time);
        Thread.sleep(time); //läheb magama, kuni ärkab üles
        System.out.printf("%s  is done\n" ,name); //ärkab üles
    } catch (Exception e) {
        System.out.println("Miski häiris und"+ e);
    }
}
}
