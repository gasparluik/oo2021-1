import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){


        ArrayList<Refrigerator> lemmikud = new ArrayList<>();
        ArrayList<Refrigerator> eu = new ArrayList<>();
        ArrayList<Refrigerator> nonEU = new ArrayList<>();


        Scanner input = new Scanner(System.in);

        System.out.println("Sisesta külmiku bränd: ");
        String brand = input.nextLine();

        System.out.println("Sisesta külmiku mudel: ");
        String model = input.nextLine();

        System.out.println("Sisesta, mis regiooni laos külmik asub( EU või mujal): ");
        String warehouse = input.nextLine();


        if (brand.equalsIgnoreCase("Bosch")){
            lemmikud.add(new Refrigerator(brand, model));
        } if(warehouse.equalsIgnoreCase("mujal")){
            nonEU.add(new Refrigerator(brand, model));
        } else if(warehouse.equalsIgnoreCase("eu")){
            eu.add(new Refrigerator(brand, model));
        } else{
            System.out.println("Sellist asukohta ei eksisteeri");
        }


        System.out.println("Kas soovid jätkata? [jah/ei]: ");
        String valid = input.nextLine();

        for(int i = 0; i < eu.size(); i++){
            System.out.println(eu.get(i).getBrand());
        }

        //System.out.println(eu.get(Refrigerator : x);
        System.out.println(nonEU);


        input.close();

    
    }


}
