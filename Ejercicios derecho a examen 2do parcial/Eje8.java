import java.util.Scanner;
class Eje8{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		double aho=0, money=500, itr=.09, mes;
		for(int i=1;i<=12;i++){
			aho=aho+money;
			mes=aho*itr;
			aho=aho+mes;
			System.out.printf("Ahorro del mes " +i + " es de %.2f\n", + aho);
		}
		System.out.printf("El total final ahorrado es de $%.2f\n", +aho);
	}
}