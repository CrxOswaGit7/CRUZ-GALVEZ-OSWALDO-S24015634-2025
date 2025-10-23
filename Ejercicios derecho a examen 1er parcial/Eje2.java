import java.util.Scanner;
class Eje2{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double a, l, rad;
		System.out.println("Ingrese la medida del radio del circulo");
		rad=pou.nextDouble();
		System.out.println("===================");
		l=(2*3.1416*rad);
		a=(3.1416*(rad*rad));
		System.out.printf("La longitud del circulo es de: %.2f", +l);
		System.out.printf("\nEl area del circulo es de: %.2f", +a);
	}
}
		
