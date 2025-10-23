import java.util.Scanner;
class Eje11{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		int a, b, c, mayor=0, menor=0, prom;
		System.out.println("Ingrese el primer número");
		a=pou.nextInt();
		System.out.println("Ingrese el segundo número");
		b=pou.nextInt();
		System.out.println("Ingrese el tercer número");
		c=pou.nextInt();
		prom=(a+b+c)/3;

		if(a==b && a==c){
			System.out.println("Los 3 números son iguales");
		}else{
			if(a>b && a>c){
				mayor=a;
			}else{
				if(b>a && b>c){
					mayor=b;
				}else{
					mayor=c;
				}
			}
		if(a<b && a<c){
			menor=a;
		}else{
			if(b<a && b<c){
				menor=b;
			}else{
				menor=c;
			}
		}
		System.out.println("El numero mayor es: " +mayor);
		System.out.println("El numero menor es: " +menor);
		System.out.println("El promedio de los numeros es: " +prom);
		}
	}
}