import java.util.Scanner;
class Eje1{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int i=1;
		String nombre;
		while(i<=10){
			System.out.println("Ingrese el nombre numero " +i);
			nombre=pou.nextLine();
			i++;
		}
	}
}