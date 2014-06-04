			// "import java.util.*; es para que importe las clases del paquete java. incluye scanner
import java.util.*; 

public class usandoWhile {

	
	public static void main(String[] args) {
		System.out.println("Ingrese un numero: ");
		Scanner s1 = new Scanner(System.in);
		int ref1 = s1.nextInt();
		
		int x = 2;
		boolean b = false;
		while(x<ref1){
			if ((ref1%x)==0){
				b = true;
				break;
			}
			x++;
		}
		if (b){
			System.out.println("El numero ingresado no es un num primo");
		} else {
			System.out.println("El numero ingresado es un num primo");
			}
	}

}
