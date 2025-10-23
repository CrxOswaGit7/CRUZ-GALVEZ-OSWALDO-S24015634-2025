import java.util.Scanner;
class Eje13{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		System.out.println("\tEcualción de segundo grado");
 	      	System.out.print("Ingresa un numero para A: ");
  	      	int a = pou.nextInt();
    	   	System.out.print("ingresa un valor para B: ");
    	    	int b = pou.nextInt();
     	   	System.out.print("Ingresa un valor para C: ");
     	   	int c = pou.nextInt();
        
        	if(a == 0) {
            		System.out.println("Error, la ecuacion no es cuadratica");
        	} else {
            		double d = (b*b) - (4*a*c);
            
            	if(d < 0) {
                System.out.println("Error, las raices son imaginarias");
           	} else if(d == 0) {
                double x = -b / (2.0 * a);
                System.out.println("EL valor de la raiz real es de: " + x);
            	} else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("La ecuacion tiene dos raices reales: " + x1 + " y " + x2);
            }        
        }
    }
}