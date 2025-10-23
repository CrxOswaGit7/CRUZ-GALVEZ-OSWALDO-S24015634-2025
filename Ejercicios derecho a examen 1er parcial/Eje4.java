import java.util.Scanner;
class Eje4{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		int edad, an, aa;
		System.out.println("Ingrese su año de nacimiento");
		an=pou.nextInt();
		System.out.println("Ingrese el año actual");
		aa=pou.nextInt();
		edad=(aa-an);
		System.out.println("Usted tiene la edad de: " +edad + " años");
	}
}