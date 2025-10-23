import java.util.Scanner;
class Eje12{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		int op, horas;
		double s1=20000, s2=15000, s3=10000, s4=7500, dto=.072, sal, sald, sub=.15;
		System.out.println("\tPOUB SA DE CV");
		System.out.println("Por favor, escoja su categoria");
		System.out.println("1. Categoría 1");
		System.out.println("2. Categoría 2");
		System.out.println("3. Categoría 3");
		System.out.println("4. Categoría 4");
		op=pou.nextInt();
		switch(op){
			case 1:
				System.out.println("Ingrese las horas trabajadas al mes");
				horas=pou.nextInt();
				sal=(s1*horas);
				sald=(sal-(sal*dto));
				System.out.println("Su salario base es de " +sal);
				System.out.println("Su salario con descuento por concepto de salud es de " +sald);
				if(sal<1000000){
					sal=(sal+(sal*sub));
					System.out.println("Su salario base recibio un subsidio del 15%, que dá: " +sal);
				}
				break;
			case 2:
				System.out.println("Ingrese las horas trabajadas al mes");
				horas=pou.nextInt();
				sal=(s2*horas);
				sald=(sal-(sal*dto));
				System.out.println("Su salario base es de " +sal);
				System.out.println("Su salario con descuento por concepto de salud es de " +sald);
				if(sal<1000000){
					sal=(sal+(sal*sub));
					System.out.println("Su salario base recibio un subsidio del 15%, que dá: " +sal);
				}
				break;
			case 3:
				System.out.println("Ingrese las horas trabajadas al mes");
				horas=pou.nextInt();
				sal=(s3*horas);
				sald=(sal-(sal*dto));
				System.out.println("Su salario base es de " +sal);
				System.out.println("Su salario con descuento por concepto de salud es de " +sald);
				if(sal<1000000){
					sal=(sal+(sal*sub));
					System.out.println("Su salario base recibio un subsidio del 15%, que dá: " +sal);
				}
				break;
			case 4:
				System.out.println("Ingrese las horas trabajadas al mes");
				horas=pou.nextInt();
				sal=(s4*horas);
				sald=(sal-(sal*dto));
				System.out.println("Su salario base es de " +sal);
				System.out.println("Su salario con descuento por concepto de salud es de " +sald);
				if(sal<1000000){
					sal=(sal+(sal*sub));
					System.out.println("Su salario base recibio un subsidio del 15%, que dá: " +sal);
				}
				break;
			default:
				System.out.println("Categoria no valida");

		}
	}
}