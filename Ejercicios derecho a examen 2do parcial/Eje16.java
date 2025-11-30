import java.util.Scanner;
class Eje16{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		String articulos[][]=new String [3][3];
		String cara[]={"Color","Talla"};
		for(int i=0;i<3;i++){
			System.out.println("= = = = = = =");
			System.out.println("Ingrese el articulo numero: " + (i+1));	
			articulos[i][0]=pou.nextLine();
			for(int j=0;j<2;j++){
				System.out.println("Ingrese " + cara[j] + " del articulo: " +articulos[i][0]);
				articulos[i][j+1]=pou.nextLine();
			}
		}
		for(int i=0;i<3;i++){
			System.out.println("Artículo: " + articulos[i][0] + " || color: " + articulos[i][1] + " || talla: " + articulos[i][2]);
		}

	}
}
