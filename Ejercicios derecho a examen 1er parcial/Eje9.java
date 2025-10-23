import java.util.Scanner;
class Eje9{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double sal, sala, irt=1.25;
		System.out.println("\tSALARIO NUEVO");
		System.out.println("Hola, por favor ingrese su sueldo anterior");
		sala=pou.nextDouble();
		sal=(sala*irt);
		System.out.println("¡¡Felicidades, obtuvo un incremento del 25%!!");
		System.out.println("Su sueldo actual con el incremento es de $" +sal);
	}
}
		