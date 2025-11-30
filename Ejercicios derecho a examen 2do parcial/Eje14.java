import java.util.Scanner;
class Eje14{
	public static void main(String args[]){
		Scanner pou=new Scanner(System.in);
		String nomb[]=new String [4];
		int sueldo[][]=new int[4][3];
		int pop[]=new int[4];
		int suma, total=0, memp, empleado=0;
		
		for(int i=0;i<4;i++){
			System.out.println("Ingresa el nombre del trabajador: " + (i+1));
			nomb[i]=pou.nextLine();
			System.out.println("Ingresa el sueldo del empleado: " + nomb[i]);
			for(int j=0;j<3;j++){
				System.out.println("Mes " + (j+1) + ":");
				sueldo[i][j]=pou.nextInt();
			}
		pou.nextLine();
		}
		
		for(int i=0;i<4;i++){
			suma=0;
			for(int j=0;j<3;j++){
				suma=suma+sueldo[i][j];
			}
			pop[i]=suma;
		}	
		for(int i=0;i<4;i++){
			total=total+pop[i];
		}

		memp=pop[0];
		for(int i=1;i<4;i++){
			if(pop[i]>memp){
				memp=pop[i];
				empleado=i;
			}
		}
		System.out.println("El empleado: " + nomb[empleado] + " tuvo un mayor ingreeso equivalente a " +memp);	
		System.out.println("El total pagado por semana es de :" + total);
	}
}

