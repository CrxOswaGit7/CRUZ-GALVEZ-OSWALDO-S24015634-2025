import java.util.Scanner;
class Eje11{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int num[]=new int [10];
		boolean pepe=false;
		for(int i=0;i<8;i++){
			System.out.println("Ingrese el numero en la posicion " + (i+1));
			num[i]=pou.nextInt();
		}
		System.out.println("Ingrese el numero a buscar");
		int bus=pou.nextInt();
		for(int i=0;i<8;i++){
			if(num[i]==bus){
				System.out.println("El numero si está en la lista, en la posicion [" + (i+1) + "]");
				pepe=true;
			}
		}
		if(pepe==false){
			System.out.println("El numero no se encuentra en la lista");
		}
	}
}

