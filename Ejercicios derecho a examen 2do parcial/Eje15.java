import java.util.Scanner;
class Eje15{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		String pais[]=new String [4];
		double temp[][]=new double[4][3];
		double media[]=new double[4];
		double suma, mmedia;
		int pama=0;
		
		for(int i=0;i<4;i++){
			System.out.println("= = = = =");
			System.out.println("Ingresa el nombre del pais: " + (i+1));
			pais[i]=pou.nextLine();
			System.out.println("Ingresa las temps del pais: " + pais[i]);
			for(int j=0;j<3;j++){
				System.out.println("Mes " + (j+1) + ":");
				temp[i][j]=pou.nextInt();
			}
		pou.nextLine();
		}
		
		for(int i=0;i<4;i++){
			suma=0;
			for(int j=0;j<3;j++){
				suma = suma+temp[i][j];
			}
			media[i]=suma/3;
		}	
		System.out.println("=================");
		System.out.println("Temperatura media");
		for(int i=0;i<4;i++){

			System.out.println(pais[i] + ": " + media[i]);
		}

		mmedia = media[0];
		for(int i=1;i<4;i++){
			if(media[i]>mmedia){
				mmedia=media[i];
				pama=i;
			}
		}
		System.out.println("===============");
		System.out.println("El país con mayor temperatura trimestral es: " + pais[pama] + " con " + mmedia);
	}
}
