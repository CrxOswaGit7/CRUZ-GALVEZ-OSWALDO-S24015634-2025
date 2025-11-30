import java.util.Scanner;
class Eje3{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		int op;
		char rop;
		do{
		int ado=1000;
		System.out.println("\tCeFeE");
		System.out.println("====================");
		System.out.println("1. Consulta");
		System.out.println("2. Pago del mes");
		System.out.println("3. Pago de adeudo");
		System.out.println("4. Salir");
		System.out.println("======================");
		System.out.println("Por favor, seleccione una opcion");
		op=pou.nextInt();
		
		switch(op){
			case 1:
				System.out.println("Usted tiene un pago pendiente por $" +ado);
				break;
			case 2:
				System.out.println("El total a pagar por mes es de $" +ado);
				break;
			case 3:
				System.out.println("El total a pagar por adeudo es de $" +ado);
				break;
			case 4:
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