package AtmYCliente;
import target.*;
public class principal {

	public static void main (String[]args) {
		escanerDeTarjeta tar =new escanerDeTarjeta();
		tarjetaATM ATM =new tarjetaATM();
	tar.aceptarTarjeta();
	//ATM.configurarPIN(0116);
	
	
	}
}
