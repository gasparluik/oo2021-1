import java.io.IOException;
import java.util.Scanner;

public class Algarvud {
    public static void main(String[] args) throws IOException{
        System.out.print("Sisesta algarv: ");

        Scanner input = new Scanner(System.in); // kasutaja sisend
        int inputNumb = input.nextInt();
        checkNumb(inputNumb);
        System.out.println("-------------------");
        divideBy(inputNumb);
        input.close();
    }

    //kontrolli kas sisestatud arv on algarv
    public static void checkNumb(int value){
        int calc = value%2;
        if(calc != 0){
            System.out.println("Sisestatud arv on algarv");
        } else{
            System.out.println("Sisestatud arv ei ole algarv");
        }
    }

    //Kontrolli kas arv jagub 2, 3, 5, 7-ga
    public static void divideBy(int value){
        if(value%2 == 0){
            System.out.println("Sinu arv jagub 3-ga");
        }else if(value%3 == 0){
            System.out.println("Sinu arv jagub 3-ga");
        }else if(value%5 == 0){
            System.out.println("Sinu arv jagub 5-ga");
        } else if(value%7 == 0){
            System.out.println("Sinu arv jagub 7-ga");
        } else{
            System.out.println("Sinu arv ei jagu 2, 3, 5 ,7-ga");
        }

    }

}


