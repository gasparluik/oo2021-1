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

        makeList();
    }

    //kontrolli kas sisestatud arv on algarv
    public static void checkNumb(int value){
      boolean flag = false;

      for (int i = 2; i <= value / 2; ++i) {
        // condition for nonprime number
        if (value % i == 0) {
          flag = true;
          break;
        }
      }
  
        if (!flag){
          System.out.println(value + " on algarv.");
        }else{
          System.out.println(value + " ei ole algarv.");
        }
      }

    public static boolean booleanCheck(int value){
      if (value <= 1){
			return false;
      }

      for (int i = 2; i < value; i ++){
        if (value % i == 0)
          return false;
      }

      return true;

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
            System.out.println("Sinu arv ei jagu 2, 3, 5 ega 7-ga");
        }
    }

    public static void makeList() {
      int length = 1000;
      int[] listNumbers = new int[length];
      int n = 0;
      for (int i = 2;n < length;i ++){

        if(booleanCheck(i)){
          listNumbers[n] = i ;
          n ++;
        }
      } //for loop end
      
      int thousandSquare = listNumbers[999]*listNumbers[999];
    
      System.out.println("Listi algarva kohal 1000 on: " + listNumbers[999]);
      System.out.println("Tuhandenda algarvu ruut: " +thousandSquare);

      int[] tenNumbers = new int[10];
      int m = 0;
      for (int i = thousandSquare;m < 10;i--){
        if(booleanCheck(i)){
          tenNumbers[m]=i;
          m ++;
        }
      }// for loop end
	} // makeList end
  }


