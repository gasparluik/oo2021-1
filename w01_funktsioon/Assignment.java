import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Assignment{
    public static void main(String[] args){
       int weight, speed, equation, i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Speed: ");
        String name = scanner.nextLine();
        System.out.println("your weight: ");

        weight = 78;
        speed = 3; // km/h
        equation = weight * speed;
        
        while (i < speed){
            System.out.println("ikka väiksem, kui 3");
            ++i
            if (i == 5){
                System.out.println("I väärtus on nüüd 3!");
            }
        }


        if (equation > 3000){
            System.out.println(equation + "Njuutonit...."+"That is a lot of power!");
        } else{
            System.out.println("Sinu jõud kukkumisel on: " + equation + " Njuutonit");
        }

    }
}