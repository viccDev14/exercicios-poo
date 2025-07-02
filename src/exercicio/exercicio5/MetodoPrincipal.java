package exercicio.exercicio5;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Antecessor numero = new Antecessor();
		
		System.out.print("Digite um numero inteiro: ");
		int valor = in.nextInt();
		
		numero.setValor(valor);
		
		System.out.println("O antecessor de " + numero.getValor() + " é " + numero.getAntecessor());
	}

}
