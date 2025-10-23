import java.util.Scanner;
class Eje1{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double mtr, pie, pulg;
		System.out.println("\tCONVERSOR");
		System.out.println("Ingrese la cantidad de metros");
		mtr=pou.nextDouble();
		System.out.println("===================");
		pie=(mtr*3.281);
		pulg=(mtr*39.37);
		System.out.println("La conversión de " +mtr + " a pies es de: " +pie);
		System.out.println("La conversión de " +mtr + " a pulgadas es de: " +pulg);
	}
}