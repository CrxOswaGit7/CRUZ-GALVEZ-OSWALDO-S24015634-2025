import java.util.Scanner;
class Eje5{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double t, cel, fah;
		System.out.println("\tCONVERSOR");
		System.out.println("Ingrese la temperatura en Grados Celsius");
		cel=pou.nextDouble();
		fah=((cel*9/5)+32);
		t=(cel+273.15);
		System.out.println("La temperatura " +cel + "°C, equivale a " +fah + "° Fahrenheit");
		System.out.println("La temperatura absoluta de " +cel + "°C, es equivalente a " +t + " K");
	}
}