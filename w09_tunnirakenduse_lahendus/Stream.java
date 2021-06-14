import java.io.IOException;
import java.util.stream.IntStream;

public class Stream {
public static void main(String[] args)throws   IOException {
    
    IntStream
        .range(1,10) //vahemik
        .skip(5) //skipib kuni viienda indeksini
        .forEach(System.out::print);
    System.out.println();
}
    
}
