import java.util.Scanner;

public class Chords {

    public static void main(String[] args){
        System.out.println("Sisesta põhitoon: ");
        Scanner input = new Scanner(System.in);
        int mainTone = input.nextInt();
        int terts = mainTone + 4;
        int kvint = mainTone + 7;

        if (mainTone = 50){
            CTone ctone = new CTone(mainTone, terts, kvint);
            ctone.showTone();
            ctone.showTerts();
            ctone.showKvint();
        } else if(mainTone = 60){
            FTone ftone = new FTone(mainTone, terts, kvint);
            ftone.showTone();
            ftone.showTerts();
            ftone.showKvint();
        }


    }
}
