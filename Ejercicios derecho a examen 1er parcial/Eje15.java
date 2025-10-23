import java.util.Scanner;
class Eje15{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		float calif;
		System.out.println("Por favor, ingrese la calificación en una escala de 0.0 a 5.0");
		calif=pou.nextFloat();
		if(calif >= 0.0 && calif<=1){
			System.out.println("Tu calificación tiene la valoración: P (Pésimo)");
		}else{
			if(calif>=1.1 && calif<=2){
				System.out.println("Tu calificación tiene la valoración: M (Mal)");
			}else{
				if(calif>=2.1 && calif<3){
					System.out.println("Tu calificación tiene la valoración: R (Regular)");
				}else{
					if(calif>=3 && calif<=4){
						System.out.println("Tu calificación tiene la valoración: B (Bien)");
					}else{
						if(calif>=4.1 && calif<=5){
							System.out.println("Tu calificación tiene la valoración: E (Excelente)");
						}else{
							System.out.println("La calificación esta fuera del rango establecido :o");
						}
					}
				}
			}
		}
	}
}