import java.util.Scanner;


public class parImpar {

	public static void main(String[] args) {
		System.out.println("Ingrese un numero: ");
		Scanner s1 = new Scanner(System.in);
		int ref1 = s1.nextInt();
		
			if(ref1%2==0){
				System.out.println("El numero ingresado es par");
			}else{
				System.out.println("El numero ingresado es impar");
			}
	}

}
