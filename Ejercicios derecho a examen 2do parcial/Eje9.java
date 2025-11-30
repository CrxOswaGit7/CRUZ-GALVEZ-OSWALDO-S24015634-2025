import java.util.Scanner;
class Eje9{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		double cali[]=new double [6];
		double suma=0, prom;
		for(int i=0;i<5;i++){
			System.out.println("Ingrese la calificacion del alumno " + (i+1));
			cali[i]=pou.nextInt();
				if(cali[i]>=0 && cali[i]<=10){
					suma=suma+cali[i];
				}else{
					System.out.println("Calificacion inválida");
					return;
				}
		}
		for(int i=0;i<5;i++){
			System.out.println("La calificacion del estudiante " + (i+1) + " es de " + cali[i]);
		}
		prom=suma/5;
		System.out.println("El promedio general del grupo es de " +prom);
	}
}