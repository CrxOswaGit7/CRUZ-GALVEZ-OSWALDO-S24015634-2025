import java.util.Scanner;
class Ejee3{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int fil, alt, esp, ast;
		System.out.println("Ingresa la altura de la piramide");
		fil=pou.nextInt();
		for(alt=1;alt<=fil;alt++){
			for(esp=1;esp<=fil-alt;esp++){
				System.out.print(" ");
			}
			for(ast=1;ast<=(alt*2)-1;ast++){
				System.out.print("*");
			}
			System.out.println();
		}
		pou.close();
	}
}