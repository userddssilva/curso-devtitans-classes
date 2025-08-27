import java.io.*;
import java.util.Scanner;

class SomaColecao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		String[] stringNumbers = entrada.split(" ");
		int i = 0;
		int soma = 0;
		while(!stringNumbers[i].equals("-1")) {
			int number = Integer.parseInt(stringNumbers[i]);
			soma += number;
			i++;
		}
		System.out.printf("%d\n", soma);
		scanner.close();
	}
}
