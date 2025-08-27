import java.util.Scanner;

class CaixaEletronico{
	public static int validaEntrada(String entrada) {
		try{
			int number = Integer.parseInt(entrada);
			return (number > 0 && number % 2 == 0) ? number : 0;
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		int[] notas = {50, 10, 2};
		int[] quantidadeNotas = new int[3];
		int entradaValidada = validaEntrada(entrada);
		if (entradaValidada != 0){
			for (int i = 0; i < 3; i++){
				if (entradaValidada >= notas[i]){
					quantidadeNotas[i] = entradaValidada / notas[i];
					entradaValidada = entradaValidada % notas[i];
				}
			}
			System.out.println(quantidadeNotas[0] + " notas de R$" + notas[0] + ", " + quantidadeNotas[1] + " notas de R$" + notas[1] + " e " + quantidadeNotas[2] + " notas de R$" + notas[2]);
		} else {
			System.out.println("Valor Invalido");
		}
		scanner.close();
	}
}
