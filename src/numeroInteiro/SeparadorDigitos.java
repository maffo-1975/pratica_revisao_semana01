package numeroInteiro;

public class SeparadorDigitos {

	private static byte quantidadeDigitos = 5;
	private static int[] digitos = new int[quantidadeDigitos];

	public static void exibeDigitosSeparados(int numero) throws SeparadorDigitosException {

		double potencia = (double) quantidadeDigitos - 1.0;
		double resultadoPotenciacao = Math.pow(10.0, potencia);

		int divisor = (int) resultadoPotenciacao;
		int redutor = 10;

		boolean quantidadeCorretaDigitos = (numero / divisor > 0 && numero / divisor < 10) ? true : false;

		if (quantidadeCorretaDigitos) {

			for (byte i = 0; i < quantidadeDigitos; i++) {
				digitos[i] = numero / divisor;
				numero = numero % divisor;
				divisor /= redutor;
			}

			System.out.println();
			System.out.print("Resultado: ");

			for (byte i = 0; i < quantidadeDigitos; i++) {
				if (i == quantidadeDigitos - 1)
					System.out.printf("%d", digitos[i]);
				else
					System.out.printf("%d   ", digitos[i]);
			}

		} else {
			String mensagem = "Número não tem " + quantidadeDigitos + " dígitos ou não é positivo";
			throw new SeparadorDigitosException(mensagem);
		}
	}
}
