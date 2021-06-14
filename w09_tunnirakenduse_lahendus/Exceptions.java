
import java.util.Scanner;


public class Exceptions{
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        int n = scanner.nextInt();
        System.out.println(n);
    } catch (NullPointerException e) { //array või midagi on null
        System.out.println("Your array is null");
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Your index is out of bounds"); //indeks ei sobi array mahutavusesse 
    }

    scanner.close();
    }

    
}