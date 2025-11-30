import java.util.Scanner;
class Eje12{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int venta[]=new int [7];
		int mventa=0, dia=1, total=0;
		for(int i=0;i<7;i++){
			System.out.println("Ingresa las ventas realizadas el dia "+ (i+1));
			venta[i]=pou.nextInt();
		}
		for(int i=0;i<7;i++){
			total=total+venta[i];
		}
		mventa=venta[0];
		for(int i=1;i<7;i++){
			if(venta[i]>mventa){
				mventa=venta[i];
				dia=(i+1);
			}
		}
		System.out.println("El día " + dia + " tuvo más ventas con un total de " +mventa);	
	}
}
 