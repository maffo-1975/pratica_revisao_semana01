package programaPrincipal;

import java.util.Scanner;

import numeroInteiro.SeparadorDigitos;

public abstract class ExibidorDigitos {

	public static void main(String[] args) {

		byte quantidadeDigitos = 5;

		System.out.printf("Número positivo com %d digitos: ", quantidadeDigitos);

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		boolean quantidadeCorretaDigitos = SeparadorDigitos.separaDigitos(numero);

		if (quantidadeCorretaDigitos) {

			int[] digitos = SeparadorDigitos.retornaDigitos();

			System.out.println();
			System.out.print("Resultado: ");

			for (byte i = 0; i < quantidadeDigitos; i++) {
				if (i == quantidadeDigitos - 1)
					System.out.printf("%d", digitos[i]);
				else
					System.out.printf("%d   ", digitos[i]);
			}

		} else {
			System.out.printf("%nNúmero não tem %d digitos ou não é positivo", quantidadeDigitos);
		}

		sc.close();
	}
}
