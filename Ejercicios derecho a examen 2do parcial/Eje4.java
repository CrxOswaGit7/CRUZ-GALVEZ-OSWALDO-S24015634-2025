import java.util.Scanner;
class Eje4{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int i,j, op;
		char rop;
		int money=5000;
		do{
		int cant;
		System.out.println("\tCajero");
		System.out.println("====================");
		System.out.println("1. Retirar dinero");
		System.out.println("2. Consultar saldo");
		System.out.println("2. Salir");
		System.out.println("======================");
		System.out.println("Por favor, seleccione una opcion");
		op=pou.nextInt();
		
		switch(op){
			case 1:
				System.out.println("Ingrese la cantidad a retirar");
				cant=pou.nextInt();
				if(cant>money || cant<=0){
					System.out.println("Dinero insificiente");
				}else{
					if(cant<=money && cant>0){
						System.out.println("Usted ha retitado $" +cant);
						money=money-cant;
					}
				}

				break;
			case 2:
				System.out.println("Usted tiene un saldo disponible de $" +money);
				break;
			case 3:
				System.out.println("Saliendo....");
				rop='n';
				continue;
			default:
				System.out.println("Opcion invalida, intente de nuevo");
		}
		System.out.println("¿Desea realizar otra operación? (s/n)");
		rop=pou.next().charAt(0);
		}while(rop== 's' || rop== 'S');
		System.out.println("¡Gracias por su preferencia!");
	}
}