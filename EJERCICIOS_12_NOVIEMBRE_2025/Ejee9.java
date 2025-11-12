import java.util.Scanner;
class Ejee9{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		double edad, em=0, md=0, malt=0, pm=0, ep=0, am=0, pmm, alt;
		int i;
		for(i=1;i<=5;i++){
			System.out.println("Ingrese los datos del alumno " +i);
			System.out.println("Edad");
			edad=pou.nextInt();

			System.out.println("Altura (formato x.xx)");
			alt=pou.nextFloat();
			md=md+edad;
			ep=ep+alt;
			if(edad>18){
				em=em+1;
			}
			if(alt>1.75){
				malt=malt+1;
			}
		}
		pmm=md/5;
		am=ep/5;
		System.out.println("La edad media es:" +pmm);
		System.out.println("El promedio de la altura media es :" +am);
		System.out.println("Alumnos mayores a 18 son: " +em);
		System.out.println("Alumnos mayores a 1.75 hay: " +malt);
		pou.close();
	}
}