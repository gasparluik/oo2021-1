import java.util.Scanner;

public class Assignment{
    public static void main(String[] args){
        //Püstitan küsimuse 
        String answer = "Ei";
        System.out.println("Kas päevas on piisavalt tunde?");

        //aktiveerin scanneri, mis scannib tähemärke??
        Scanner scanner = new Scanner(System.in);
        //nextLine() loeb järgnevat inputi(scanner)
        String input = scanner.nextLine();

        //Klassikaline if else statement
        if (answer.toLowerCase().equals(input.toLowerCase())){  // toLowerCase() annab kasutajale veidi eksimisruumi (Ei või ei, pole vahet)
            System.out.println("Väga õige, nii palju on ju teha");
        } else {
            System.out.println("Ei nõustu, aga palun põhjenda enda otsust");
            // Teen uue scanneri ja inputi
            Scanner explanation = new Scanner(System.in);
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