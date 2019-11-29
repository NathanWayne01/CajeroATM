package AtmYCliente;

public class ATM {

	private String ubicacion;
	private String nombreDeLaSucursal;
public ATM(String ubicacion,String nombreDeLaSucursal) {
this.nombreDeLaSucursal="Banco BanReservas #1";
this.ubicacion="C/ Juan Camacho #89";
}
public void mostrarDatos() {
	System.out.println("     "+nombreDeLaSucursal);
	System.out.println("     "+ubicacion);

}
	
}
