import java.util.Scanner;
class Eje3{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		int seg=6, edad, pul;
		System.out.println("\tPULSACIONES POR EJERCICIO");
		System.out.println("Ingrese su edad");
		edad=pou.nextInt();
		pul=(220-edad)/seg;
		System.out.println("Su numero de pulsaciones por 10 segundos de ejercicio es de: " +pul);
	}
}