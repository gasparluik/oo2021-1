
public class FTone extends Tones{
    public FTone(int mainTone, int kvint, int terts){
        super(mainTone, kvint, terts);

    }
    @Override    
    public void showTone(){
        this.mainTone = this.mainTone + 5;
        System.out.println("F põhitoon on: " + this.mainTone);
    }
    @Override
    public void showKvint(){
        this.kvint = this.mainTone + 4;
        System.out.println("F Kvint on: "+ this.kvint);
    }
    public void showTerts(){
        this.terts = this.mainTone + 7;
        System.out.println("F Terts on: " + this.terts);
    }
}
