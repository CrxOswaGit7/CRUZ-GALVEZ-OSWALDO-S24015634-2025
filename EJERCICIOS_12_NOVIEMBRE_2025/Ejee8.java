import java.util.Scanner;
class Ejee8{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int num, i;
		System.out.println("Ingrese el numero 1");
		num=pou.nextInt();
		int ma=num, me=num;
		for(i=2;i<=5;i++){
			System.out.println("Ingrese el numero " +i);
			num=pou.nextInt();
			if(num>ma){
				ma=num;
			}
			if(num<me){
				me=num;
			}
		}
		pou.close();
		System.out.println("El número mayor es: " +ma);
		System.out.println("el Número menor es: " +me);
	}
}