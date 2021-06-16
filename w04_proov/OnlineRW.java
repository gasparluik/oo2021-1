import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class OnlineRW {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(
                new URL("http://www.tlu.ee/~ray/lengths.txt").openStream()));

                String line = br.readLine();
                String[] splitLine = line.split(" ");

                System.out.println(br.readLine());
                System.out.println(sum(splitLine));
    }

    public static int sum(String[] input){
        //käia läbi for each tsükkel ja arvutada summa + tagastada
        int sum = 0;

        for( String data : input){
            sum += Integer.parseInt(data);
    
        }
        return sum;
    }
    
}
