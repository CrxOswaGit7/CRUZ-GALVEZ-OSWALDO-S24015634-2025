import java.util.Scanner;
class Ejee4{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int i,j, fil, num=1;
		System.out.println("Ingrese el valor de las filas");
		fil=pou.nextInt();
		for (i=1;i<=fil;i++){
			for (j=1;j<=i;j++){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		pou.close();
	}
}