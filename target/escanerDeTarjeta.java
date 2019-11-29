package target;
import java.util.Scanner;
public class escanerDeTarjeta {

	Scanner s =new Scanner(System.in);

	public boolean aceptarTarjeta (){
		System.out.println("Seguro Que Quieres Aceptar La Tarjeta?");
		System.out.println("1-Si");
		System.out.println("2-No");
		
		boolean a=true;
		int b=s.nextInt();
		
		if (b==1) {
			a=true;
			System.out.println("Su Tarjeta Se Ha Introducido Con Exito ");
		}else if (b==2) {
			a=false;
			System.out.println("No Se Acepto Su Tarjeta");
		}else {
			System.out.println("No Es Una Opcion Valida");
		}
		return a;	
	}	
	
	
	
	
}
