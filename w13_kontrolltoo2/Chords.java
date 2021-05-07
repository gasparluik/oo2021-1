
public class Chords {

    public static void main(String[] args){
        ConvertTone();
    }

    public class Chord{
        int tone;
        char letter;
        int add7;
        int add4;

    }

    public ConvertTone(){
        System.out.println("Sisesta põhitoon, mida tahad konverteerida: ");

        Scanner input = new Scanner();
        int add7 = input + 7;
        int add4 = input + 4;
        System.out.println("Sisestatud põhitoon:" + input +"\n" + "Terts: "+ add4 +  "\n" + "Kvint: " + add7);

        
    }
}
