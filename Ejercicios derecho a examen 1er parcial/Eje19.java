import java.util.Scanner;
class Eje19{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double mto, gin, g1=.40, tra, t1=.30, ped, p1=.30;
		System.out.println("Por favor, ingrese el presupuesto anual total a repartir");
		mto=pou.nextDouble();
		if(mto<0){
			System.out.println("No hay nada que repartir");
		}else{
			gin=(mto*g1);
			tra=(mto*t1);
			ped=(mto*p1);
			System.out.println("El presupuesto correspondiente al 40% en ginecología es de: $" +gin);
			System.out.println("El presupuesto correspondiente al 30% en traumatología es de: $" +tra);
			System.out.println("El presupuesto correspondiente al 30% en pediatría es de: $" +ped);
		}
	}
}