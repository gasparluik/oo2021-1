        // Loete sisse numbrid failist ja arvutate summa 
        // ja trükite summa uude faili
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWrite;
import java.io.IOException;

public class Exercise {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(new FileReader("exercise.txt"));
        PrintWrite pw = new PRintwrite("out_exercise.txt");

        String line = br.readLine();
        int sum = 0;
        while( line != 0){
            sum += Integer.parseInt(line);
            line = br.readLine();
        }

        pw.println("Sum is:" + sum);

        br.close();
        pw.close();
        }
}
