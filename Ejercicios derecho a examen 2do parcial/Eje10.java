import java.util.Scanner;
class Eje10{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int num[]=new int [10];
		System.out.println("Ingrese 10 numeros");
		for(int i=0;i<10;i++){
			num[i]=pou.nextInt();
		}
		System.out.println("Los numeros en orden inverso son:");
		for(int i=9;i>=0;i--){
			System.out.println(num[i]);
		}
	}
}


//Diseña un programa que lea 10 números y los almacene en un vector. Al 
//final, muestra los números en orden inverso al que fueron capturados.