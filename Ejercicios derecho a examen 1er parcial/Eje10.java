import java.util.Scanner;
class Eje10{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		float prom, cal1, cal2, cal3;
		System.out.println("\tPROMEDIO MATERIAS");
		System.out.println("Ingrese la calificación obtenida en Matemáticas");
		cal1=pou.nextFloat();
		System.out.println("Ingrese la calificación obtenida en Física cuántica");
		cal2=pou.nextFloat();
		System.out.println("Ingrese la calificación obtenida en Gastronomía");
		cal3=pou.nextFloat();
		prom=((cal1+cal2+cal3)/3);
		System.out.printf("\nEl promedio obtenido entre las 3 materias es de %.2f", +prom);
	}
}
