import java.util.Scanner;
class Eje6{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		int hom, fem;
		double tt, th, tf;
		System.out.println("\tESTUDIANTES");
		System.out.println("Ingrese cuántos hombres hay en el aula");
		hom=pou.nextInt();
		System.out.println("Ahora, ingrese cuántas mujeres hay en el aula");
		fem=pou.nextInt();
		System.out.println("=====================");
		tt=(hom+fem);
		th=((hom/tt)*100);
		tf=((fem/tt)*100);
		System.out.println("El porcentaje de hombres en el aula es del " +th + "%");
		System.out.println("El porcentaje de mujeres en el aula es del " +tf + "%");
	}	
}