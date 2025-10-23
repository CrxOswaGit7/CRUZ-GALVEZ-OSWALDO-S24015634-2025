import java.util.Scanner;
class Eje14{
	public static void main(String args []){
		Scanner pou=new Scanner(System.in);
		double com, vta, tcom=0, c1=.02, c2=.04, c3=.10;
		System.out.println("Ingrese el valor de la primera venta");
		vta=pou.nextDouble();
		if(vta<=10000000){
			com=vta*c1;
		}else{
			if(vta>10000000 && vta<=15000000){
				com=vta*c2;
			}else{
				com=vta*c3;
			}
		}
		tcom=tcom+com;
		System.out.println("Ingrese el valor de la segunda venta");
		vta=pou.nextDouble();
		if(vta<=10000000){
			com=vta*c1;
		}else{
			if(vta>10000000 && vta<=15000000){
				com=vta*c2;
			}else{
				com=vta*c3;
			}
		}
		tcom=tcom+com;
		System.out.println("Ingrese el valor de la tercera venta");
		vta=pou.nextDouble();
		if(vta<=10000000){
			com=vta*c1;
		}else{
			if(vta>10000000 && vta<=15000000){
				com=vta*c2;
			}else{
				com=vta*c3;
			}
		}
		tcom=tcom+com;
		System.out.println("Ingrese el valor de la cuarta venta");
		vta=pou.nextDouble();
		if(vta<=10000000){
			com=vta*c1;
		}else{
			if(vta>10000000 && vta<=15000000){
				com=vta*c2;
			}else{
				com=vta*c3;
			}
		}
		tcom=tcom+com;
		System.out.println("La comisión total ganada por las ventas es de: $" +tcom);
	}
}


