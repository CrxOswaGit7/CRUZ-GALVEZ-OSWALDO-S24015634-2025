import java.util.Scanner;
class Eje16{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		int num;
		System.out.println("Ingresa un número para saber si es par o impar");
		num=pou.nextInt();
		if(num % 2==0){
			System.out.println("Usted escribió el número: " +num);
			System.out.println("¡El número " +num + " es par!");
		}else{
			System.out.println("Usted escribió el número: " +num);
			System.out.println("¡El número " +num + " es impar!");
		}
	}
}


