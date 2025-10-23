import java.util.Scanner;
class Eje7{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double mto, dto, pct=.15;
		System.out.println("\tDESCUENTO COMPRA");
		System.out.println("Ingrese el monto de su compra");
		mto=pou.nextDouble();
		dto=(mto-(mto*pct));
		System.out.println("¡¡El descuento ofertado para su compra es del 15%!!");
		System.out.println("El total a pagar es de: $" +dto);
	}
}
		