import java.util.Scanner;
class Eje6{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int i, ap=0, rep=0;
		double prom, cali, suma=0;
		for (i=1;i<=5;i++){	
			System.out.println("Ingrese la calificacion (escala 1-10) del alumno" +i);
			cali=pou.nextDouble();
			suma=suma+cali;
			if(cali>=6 && cali<=10){
				ap++;
			}else{
				if(cali>0 && cali<6){
					rep++;
				}else{
					System.out.println("Calificacion Invalida, Ejecuta de nuevo muajaja");
					return;
				}
			}
		}
		prom=suma/5;
		System.out.println("El total de aprobados es de: " +ap);
		System.out.println("El total de reprobados es de: " +rep);
		System.out.println("El promedio del grupo es de: " +prom);
	}
}