package target;
import java.util.Scanner;
public class tarjetaATM {

	Scanner s =new Scanner(System.in);
	
	private int PIN;
	private long IDDeLaTarjeta;
	
	
	public void configurarPIN (int number) {
		
		System.out.println("cual es tu PIN?");
		int a=s.nextInt();
		PIN=a;
		System.out.println(PIN);
		
	}

	public int getPIN() {
		return PIN;
	}


}
