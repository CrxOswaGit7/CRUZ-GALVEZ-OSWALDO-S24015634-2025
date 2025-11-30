import java.util.Scanner;
class Eje17 {
	public static void main(String[] args) {
		Scanner pou=new Scanner(System.in);
		int na=5;
		double mt;
		String atletas[][] = new String[na][3];
		double tiempos[] = new double[na];
		for (int i = 0; i < na; i++) {
			System.out.println("==============");
			System.out.println("Atleta numero " + (i + 1));
			System.out.print("Nombre: ");
			atletas[i][0] = pou.nextLine();
			System.out.print("Apellido: ");
			atletas[i][1] = pou.nextLine();
			System.out.print("Especialidad (metros en awa): ");
			atletas[i][2] = pou.nextLine();
			System.out.print("Tiempo (segundos): ");
			tiempos[i] = pou.nextDouble();
			pou.nextLine();
		}
		mt = tiempos[0];
		int im = 0;
		for (int i = 1; i < na; i++) {
			if (tiempos[i] < mt) {
			mt = tiempos[i];
			im = i;
			}
		}
		System.out.println("\nRESULTADOS:");
		System.out.println("Nombre || Apellido || Especialidad || Tiempo");
		for (int i = 0; i < na; i++) {
			System.out.print(atletas[i][0] + "\t " + atletas[i][1] + " \t " + atletas[i][2] + " \t " + tiempos[i]);
			if (i == im) {
				System.out.print("\t****");
			}
			System.out.println();
		}    
		System.out.println("\nEl mejor tiempo lo obtuvo: " + atletas[im][0] + " " + atletas[im][1] + " con " + mt + " segundos.");
	}
}
