

public class Main {
	public static void main(String[] args) {
        Circle ring = new Circle(5.5, "Ring");

        ring.Circumference();
        ring.Area();
        ring.moveTo(5, 8);

        System.out.println(ring.type + " ümbermõõt on: "+ring.Circumference());


    }
    
}
