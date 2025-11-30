import java.util.Scanner;
class Eje7{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		System.out.println("Ingresa un numero para desplegar su tabla");
		int num=pou.nextInt();
		System.out.println("===============");
		for(int i=1;i<=10;i++){
			int res=num*i;
			System.out.println(num + " x " + i + " = " + res);
		}
		System.out.println("===============");
	}
}