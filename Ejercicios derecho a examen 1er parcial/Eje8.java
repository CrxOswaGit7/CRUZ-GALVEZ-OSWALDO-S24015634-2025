import java.util.Scanner;
class Eje8{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double cap, inte=1.02, money;
		System.out.println("\tBANCO BANANAMEX");
		System.out.println("Ingrese el monto a invertir");
		cap=pou.nextDouble();
		money=(cap*inte);
		System.out.println("=============================");
		System.out.println("La ganancia estimada al cabo de un mes es de $" +money);
	}
}
		
		