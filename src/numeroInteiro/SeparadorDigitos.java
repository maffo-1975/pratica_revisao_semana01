package numeroInteiro;

public abstract class SeparadorDigitos {

	private static byte quantidadeDigitos = 5;
	private static int[] digitos = new int[quantidadeDigitos];

	public static void separaDigitos(int numero) {
		int divisor = 10000;
		int redutor = 10;

		for (byte i = 0; i < quantidadeDigitos; i++) {
			digitos[i] = numero / divisor;
			numero = numero % divisor;
			divisor /= redutor;
		}
	}

	public static int[] retornaDigitos() {
		return digitos;
	}
}
