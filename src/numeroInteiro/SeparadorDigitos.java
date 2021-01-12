package numeroInteiro;

public abstract class SeparadorDigitos {

	private static byte quantidadeDigitos = 5;
	private static int[] digitos = new int[quantidadeDigitos];

	public static boolean separaDigitos(int numero) {
		int divisor = 10000;
		int redutor = 10;
		
		boolean quantidadeCorretaDigitos = (numero / divisor > 0 && numero / divisor < 10) ? true : false;

		if (quantidadeCorretaDigitos) {
			for (byte i = 0; i < quantidadeDigitos; i++) {
				digitos[i] = numero / divisor;
				numero = numero % divisor;
				divisor /= redutor;
			}
		}
		
		return quantidadeCorretaDigitos;
	}

	public static int[] retornaDigitos() {
		return digitos;
	}
}
