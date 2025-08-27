import java.util.Scanner;

class DataExtenso {
	private static void splitEntradaPorSubstring(String entrada){
		int dia = Integer.parseInt(entrada.substring(0, 2));
		int mes = Integer.parseInt(entrada.substring(2, 4));
		int ano = Integer.parseInt(entrada.substring(4, 8));

		// System.out.printf("dia=%s, mes=%s, ano=%s\n", dia, mes, ano);
		printData(dia, mes, ano);
	}

	private static void splitEntradaPorDivisao(String entrada){
		int data = Integer.parseInt(entrada);
		int dia = data / 1000000;
		int mes = (data % 1000000) / 10000;
		int ano  = data % 10000;

		// System.out.printf("dia=%s, mes=%s, ano=%s\n", dia, mes, ano);
		printData(dia, mes, ano);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		splitEntradaPorSubstring(entrada);
		// splitEntradaPorDivisao(entrada);
		scanner.close();
	}

	private static void printData(int dia, int mes, int ano){
		// Convertendo o mês para extenso
		String mesExtenso = "";
		switch (mes) {
			case 1: mesExtenso = "janeiro"; break;
			case 2: mesExtenso = "fevereiro"; break;
			case 3: mesExtenso = "março"; break;
			case 4: mesExtenso = "abril"; break;
			case 5: mesExtenso = "maio"; break;
			case 6: mesExtenso = "junho"; break;
			case 7: mesExtenso = "julho"; break;
			case 8: mesExtenso = "agosto"; break;
			case 9: mesExtenso = "setembro"; break;
			case 10: mesExtenso = "outubro"; break;
			case 11: mesExtenso = "novembro"; break;
			case 12: mesExtenso = "dezembro"; break;
		}

		// Imprimindo a data por extenso
		System.out.printf("%d de %s de %d\n", dia, mesExtenso, ano);
	}
}
