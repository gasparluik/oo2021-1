import java.io.IOException;
import java.util.ArrayList;

public class Massiiv {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        ArrayList<Integer> sqrtNumbers = new ArrayList<Integer>();

        listNumbers.clear();
        checkPrime(1000, listNumbers);
        System.out.println("Value: " + closestValue(45, listNumbers));
        System.out.println("Listi suurus on: " + listNumbers.size());
        System.out.println("Listi sisu: " + listNumbers);

/*         System.out.println(listNumbers.size());
        for(int ints : listNumbers) {
            System.out.println(ints);
        } */



    }
    //kontrolli kas number on algarv ja lisa listi
    public static void checkPrime (int size, ArrayList<Integer> thisList){
        int n = 0;
        

        while (thisList.size() < size){// size on tahetud listi suurus
            double m = (double)n / (double)2;
            int flag = 0;
            
            if(n==0||n==1){
                flag = 1;    
            } else {
                for(int i=1;i<=m;i++) {
                    flag = 0;
                    if(n%i==0){
                        flag = 1;        
                    } else if(flag==0){ 
                        thisList.add(n);
                    }
                }
            }//end of else
            n++;
        }//end of while
    }
        

    //Leia lähim väärtus suurima arvu ruutjuurele
    public static int closestValue (int of, ArrayList<Integer> in) {
        int min = Integer.MAX_VALUE;
        int closest = of;
    
        for (int v : in) {
            int diff = v - of;
    
            if (diff < 0 && Math.abs(diff) < min) {
                min = Math.abs(diff);
                closest = v;
            }
        }
        return closest;
    }
}
        



        //Leiab suurima algarvu listist ning lisab sellest suurimad 10, mis on ruutjuurest väiksemad, listi
        //filterArray(listNumbers);
    //}
/* /*     public static void filterArray(ArrayList<Integer> selectedList){
        // leia listist suurim algarv, sellest ruutjuur ning prindi välja 10 arvu, mis on väiksemad sellest tehtest. Kahanevas järjekorras
/*         int equation = (int) Math.round(Math.sqrt(selectedList.get(999)));
        System.out.println("Number on: " + equation);
        int i = 0;
        System.out.println("Tema indeks on :" + selectedList.indexOf(equation)); //ahsoo, ta paneb pange, sest sellist arvu nagu 45 ei ole listis */
    //}
/*     for (i = 0; i<10; i++){
        int loop = listNumbers.get(i);
        System.out.println(loop);
        i++;
    } */