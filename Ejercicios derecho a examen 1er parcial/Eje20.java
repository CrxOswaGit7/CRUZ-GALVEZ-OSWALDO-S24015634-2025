import java.util.Scanner;
class Eje20{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double dto, d1, mto;
		int num;
		System.out.println("\t¡¡DESCUENTO!!");
		System.out.println("Por favor, Ingrese el monto de su compra");
		mto=pou.nextFloat();
		System.out.println("Estimado cliente, tecleé un número al azar");
		num=pou.nextInt();
		if(num<74){
			System.out.println("¡¡Felicidades, obtuvo un descuento del 15%!!");
			d1=(mto*.15);
			dto=(mto-(mto*.15));
			System.out.println("Su total a pagar es de $" +dto);
			System.out.println("La cantidad descontada fue de: $" +d1);
		}else{
			System.out.println("¡¡Felicidades, obtuvo un descuento del 20%!!");
			d1=(mto*.20);
			dto=(mto-(mto*.20));
			System.out.println("Su total a pagar es de $" +dto);
			System.out.println("La cantidad descontada fue de: $" +d1);
		}
	}
}
			