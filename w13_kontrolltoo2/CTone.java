
public class CTone extends Tones{
    public CTone(int mainTone, int kvint, int terts){
        super(mainTone, kvint, terts);

    }
    @Override    
    public void showTone(){
        System.out.println("C põhitoon on: " + this.mainTone);
    }
    @Override
    public void showKvint(){
        this.kvint = this.kvint + 4;
        System.out.println("C Kvint on: "+ this.kvint);
    }
    public void showTerts(){
        this.terts = this.terts + 7;
        System.out.println("C Terts on: " + this.terts);
    }
}
