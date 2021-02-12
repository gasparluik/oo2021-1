import java.util.Scanner;

public class Assignment{
    public static void main(String[] args){
        String answer = "Ei";
        System.out.println("Kas päevas on piisavalt tunde? (Jah, Ei)");

        System.out.println(scannerSet);
        System.out.println(ifElse);

    }


    String answer = "Ei";
    
    public static void scannerSet(){
        Scanner scanner = new Scanner(System.in);  //aktiveerin scanneri, mis scannib tähemärke??
        String input = scanner.nextLine();  //nextLine() loeb järgnevat inputi(scanner
    }
    public static void ifElse(){

        if (answer.toLowerCase().equals(input.toLowerCase())){  // toLowerCase() annab kasutajale veidi eksimisruumi (Ei või ei, pole vahet)
            System.out.println("Väga õige, nii palju on ju teha");
        } else {
            System.out.println("Ei nõustu, aga palun põhjenda enda otsust");
            
            Scanner explanation = new Scanner(System.in); // Teen uue scanneri ja inputi
            String input2 = explanation.nextLine();
            System.out.println("If you say so....");
            
            // Proovisin teha, et kasutaja ei saa vastuseks tühjust jätta aga ei oska :(
            /*if (input2 == true){
                System.out.println("If you say so....");
            } else{
                System.out.println("Sa ei põhjendanud end, kirjuta kasvõi midagigi");
                Scanner explanation2 = new Scanner(System.in);
                String input3 = explanation2.nextLine();
            } */
        }
    }
}
