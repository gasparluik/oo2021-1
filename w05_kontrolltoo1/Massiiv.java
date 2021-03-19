import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Massiiv {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        
        System.out.println("Listi suurus on: " + listNumbers.size());
        System.out.println("Listi sisu: " + listNumbers);
        makeList(1000, listNumbers); // genereerib listi ainult algarvudest







        int number = 1000;
        int calc = number* number;



    }
    //kontrolli kas number on algarv ja lisa listi
    public static void makeList (int size, ArrayList<Integer> thisList){
        boolean flag = false; 
        int n = 2;

        while (thisList.size() <= size){// size on tahetud listi suurus
            for (int i = 2; i <= n / 2; ++i){
                if (n % i == 0) {
                flag = true;
                break;
                }
                if(!flag){
                    thisList.add(n);
                }
                ++n;
            }
            
        }//end of while
    }
}
        

/*     //Leia lähim väärtus suurima arvu ruutjuurele
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
} */
        



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