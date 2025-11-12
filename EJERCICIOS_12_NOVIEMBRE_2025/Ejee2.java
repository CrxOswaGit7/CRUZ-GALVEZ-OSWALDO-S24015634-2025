import java.util.Scanner;
class Ejee2{
	public static void main(String args[]){
		int i, pot, num, resu=1;
		Scanner pou=new Scanner(System.in);
		System.out.println("Ingrese el numero a exponenciar");
		num=pou.nextInt();
		System.out.println("Ingrese ahora la potencia");
		pot=pou.nextInt();
		for(i=0;i<=pot;i++){
			System.out.println("El numero " +num + " ^ " + pot + " = " + resu);
			resu=resu*num;
		}


	}
}