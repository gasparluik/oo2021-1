
public class GTone extends Tones{
    public GTone(int mainTone, int terts, int kvint){
        super(mainTone, terts, kvint);

    }
    @Override    
    public void showTone(){
        //this.mainTone = this.mainTone + 7;
        System.out.println("G põhitoon on: " + this.mainTone);
    }
    @Override
    public void showKvint(){
        this.kvint = this.mainTone + 4;
        System.out.println("G Kvint on: "+ this.kvint);
    }
    public void showTerts(){
        this.terts = this.mainTone + 7;
        System.out.println("G Terts on: " + this.terts);
    }
}
