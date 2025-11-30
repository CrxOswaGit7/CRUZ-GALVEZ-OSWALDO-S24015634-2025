import java.util.Scanner;
class Eje13{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int alumnos[][]=new int [3][4];
		int i,j;	
		for(i=0;i<3;i++){
			if(i==0){
				System.out.println("======");
				System.out.println("Para nivel basico");
				System.out.println("======");
			}
			if(i==1){
				System.out.println("======");
				System.out.println("Para nivel medio");
				System.out.println("======");
			}
			if(i==2){
				System.out.println("======");
				System.out.println("Para nivel perfeccionamiento");
				System.out.println("======");
			}
				for(j=0;j<4;j++){
					if(j==0){
						System.out.println("== Para Ingles ==");
					}
					if(j==1){
						System.out.println("Para frances");
					}
					if(j==2){
						System.out.println("Para aleman");
					}
					if(j==3){
						System.out.println("Para ruso");
					}
					System.out.println("Introduce los estudiantes cursando la materia, en la posicion [" + i + "][" + j + "]:");
					alumnos[i][j]=pou.nextInt();
			}
		}
		System.out.println("\nESTUDIANTES X IDIOMA Y NIVEL");
		String[] nive = {"Básico", "Medio", "Perfeccionamiento"};
		String[] idio = {"Inglés", "Francés", "Alemán", "Ruso"};
		for(i = 0; i < 3; i++){
			System.out.println("Nivel " + nive[i] + ":");
			System.out.println("======");
				for(j = 0; j < 4; j++){
					System.out.println("  " + idio[j] + ": " + alumnos[i][j] + " estudiantes");
				}
				System.out.println();
		 }
	
	}
}
