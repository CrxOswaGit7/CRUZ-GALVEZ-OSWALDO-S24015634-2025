import java.util.Scanner;
class Arreglos2{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int kuru[]=new int [5];
		for(int i=0;i<5;i++){
			System.out.println("Introduce un numero entero");
			kuru[i]=pou.nextInt();
		}
		for(int i=0;i<5;i++){
			System.out.println("El numero guardado es");
			System.out.println(kuru[i]);
		}
	}
}