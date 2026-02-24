package view;
import java.util.InputMismatchException;
import java.util.Scanner;
import controller.Metodos;

public class Main {
	public static void main (String args [ ]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("MULTIPLICAÇÃO USANDO RECURSIVIDADE");
		
		int A = 0, B = 0;
		boolean valido = false;

		// Testando tratamento de erros
		
		while (!valido) {
		    try {
		        System.out.print("Digite um número inteiro para A: ");
		        A = sc.nextInt();
		        valido = true;
		    } catch (InputMismatchException e) {
		        System.out.println("Precisa ser um número inteiro!");
		        sc.next();
		    }
		}
		
		valido = false;
		
		while (!valido) {
			try {
				System.out.print("Digite um número inteiro para B: ");
		        B = sc.nextInt();
		        valido = true;
		    } catch (InputMismatchException e) {
		        System.out.println("Precisa ser um número inteiro!");
		        sc.next();
		    }
		}
		
		System.out.println("Multiplicando...");
		
		int result = Metodos.multiplica(A, B);
		System.out.println ("Resultado: " + result);
		
	 }
}
