import java.util.Scanner;
class Arremeses{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		String mes[]= {"Enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		int dias[]=new int [12];
		for(int i=0;i<12;i++){
			System.out.println("El mes " +mes[i] + " tiene ");
			dias[i]=pou.nextInt();

		}
	}
}