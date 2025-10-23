import java.util.Scanner;
class Eje18{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		int min, lla;
		System.out.println("Ingrese los minutos que estuvo en llamada");
		min=pou.nextInt();
		if(min>0 && min<=3){
			lla=10;
		}else{
			lla=10+(min-3);
		}
		System.out.println("El costo total de la llamada es de: $" +lla);
	}
}