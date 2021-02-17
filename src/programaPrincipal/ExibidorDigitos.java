package programaPrincipal;

import java.util.Scanner;

import numeroInteiro.SeparadorDigitos;
import numeroInteiro.SeparadorDigitosException;

public class ExibidorDigitos {

	public static void main(String[] args) {

		byte quantidadeDigitos = 5;

		System.out.printf("Número positivo com %d digitos: ", quantidadeDigitos);

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		try {
			SeparadorDigitos.exibeDigitosSeparados(numero);
		} catch (SeparadorDigitosException e) {
			System.out.print(e.getMessage());
		} finally {
			sc.close();
		}

	}
}
