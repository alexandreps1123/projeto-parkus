import java.util.Scanner;

public class ProjetoParkus {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int idade;
		
		idade = teclado.nextInt();
		
		System.out.println("Idade: "+ idade);				
		System.out.println("Hello World!");		
	}
}
