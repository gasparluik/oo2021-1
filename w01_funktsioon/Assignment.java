
public class Assignment{
    public static void main(String[] args){
        int weight, speed, equation;

        weight = 78;
        speed = 40; // km/h
        equation = weight * speed;

        if (equation > 3000){
            System.out.println(equation + "Njuutonit...."+"That is a lot of power!");
        } else{
            System.out.println("Sinu jõud kukkumisel on: " + equation + " Njuutonit");
        }

    }
}