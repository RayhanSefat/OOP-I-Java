import java.util.*;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Good morning...");
		
		Pen pen1 = new Pen();
		pen1.type = "digital";
		pen1.color = "red";
		
		Pen pen2 = new Pen(pen1);
	}
}
