import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        String valid = "jah";


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


        if (warehouse.equalsIgnoreCase("eu") | warehouse.equalsIgnoreCase("euroopa")){
            eu.add(new Refrigerator(brand, model));
        } if (brand.equalsIgnoreCase("Bosch")){
            lemmikud.add(new Refrigerator(brand, model));
        } if(warehouse.equalsIgnoreCase("mujal")){
            nonEU.add(new Refrigerator(brand, model));
        } else{
            System.out.println("Sellist asukohta ei eksisteeri");
        }


        System.out.println("Kas soovid jätkata? [jah/ei]: ");
        valid = input.nextLine();

        System.out.println(eu);
        System.out.println(lemmikud);


        input.close();

    
    }


}
