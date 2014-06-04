			// "import java.util.*; es para que importe las clases del paquete java. incluye scanner
import java.util.*; 

public class ejerc1Encapsulad {

	
	public static void main(String[] args) {
		System.out.println("Ingrese el primer numero: ");
		Scanner s1 = new Scanner(System.in);
		int ref1 = s1.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		Scanner s2 = new Scanner(System.in);
		int ref2 = s2.nextInt();
		
					// aca estoy llamando al metodo que defini mas abajo
		System.out.println(comparacion(ref1, ref2));
		
		
		}
	
	private static String comparacion(int refer1, int refer2){
		if (refer1>refer2){
			return "El primer numero es mayor al segundo";	
	
		}else if (refer1==refer2){
			
			return "Los numeros son iguales";
		
		}else{
			return "El segundo numero es mayor al primero";
		}
	}
	
}