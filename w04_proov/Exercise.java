        // Loete sisse numbrid failist ja arvutate summa 
        // ja trükite summa uude faili
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.io.IOException;

public class Exercise {

    public static void main(String[] args) throws IOException {

        String file = "exercise.txt";

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(new FileReader("exercise.txt"));
        PrintWriter pw = new PrintWriter("out_exercise.txt");

        String line = br.readLine();
        int sum = 0;
        while( line != null){
            sum += Integer.parseInt(line);
            line = br.readLine();
        }

        pw.println("Sum is:" + sum);

        br.close();
        pw.close();
        }
}
