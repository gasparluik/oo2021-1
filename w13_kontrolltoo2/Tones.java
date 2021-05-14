

public abstract class Tones {
    public int kvint;
    public int terts;
    public int mainTone;

    public Tones (int mainTone, int terts, int kvint){
        this.kvint = kvint;
        this.terts = terts;
        this. mainTone = mainTone;
    }

    public void showTone(){
        System.out.println("Põhitoon on: " + this.mainTone);
    }
    public void showKvint(){
        System.out.println("Kvint on: "+ this.kvint);
    }
    public void showTerts(){
        System.out.println("Terts on: " + this.terts);
    }
}
