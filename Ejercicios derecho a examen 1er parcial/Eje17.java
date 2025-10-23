import java.util.Scanner;
class Eje17{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		int num;
		System.out.println("Ingrese un número para ver si es primo o nel");
		num=pou.nextInt();
		if(num==1){
			System.out.println("Este número no es Primo");
		}else{
			if(num==2 || num==3 || num==5 || num==7){
				System.out.println("This número si es primo");
			}else{
				if(num%2==0 || num%3==0 || num%5==0 || num%7==0){
					System.out.println("This número ya no es primo");
				}else{
					System.out.println("This número si es primo");
				}
			}
		}
	}
}