			// "import java.util.*; es para que importe las clases del paquete java. incluye scanner
import java.util.*; 

public class ejerc1 {

	
	public static void main(String[] args) {
		System.out.println("Ingrese el primer numero: ");
		Scanner s1 = new Scanner(System.in);
		int ref1 = s1.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		Scanner s2 = new Scanner(System.in);
		int ref2 = s2.nextInt();
	
			if (ref1>ref2){
				System.out.println("El primer numero es mayor al segundo");	
		
			}else if (ref1==ref2){
				System.out.println("Los numeros son iguales");
			
			}else{
				System.out.println("El segundo numero es mayor al primero");
			}
		}
}
