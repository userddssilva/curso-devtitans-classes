import java.io.*;
import java.util.Scanner;

class TanqueCombustivel {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		String [] partes = entrada.split(" ");
		double raio = Double.parseDouble(partes[0]);
		double altura = Double.parseDouble(partes[1]);
		int calculo = Integer.parseInt(partes[2]);
		double saida = 0.0;
		if (calculo == 1) {
			// calcula o volume do ar
			saida = (Math.PI * altura * altura * (3 * raio - altura)) / 3.0;
		} else {
			// calcula o volume do combustivel Volume Total - Volume Calota
			double volumeTotal = (4.0 * Math.PI * raio * raio * raio) / 3.0;
			double volumeAr = (Math.PI * altura * altura * (3 * raio - altura)) / 3.0;
			saida = volumeTotal - volumeAr;
		}
		System.out.printf("%.4f", saida);
		scanner.close();
	}
}
