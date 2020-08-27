/*
Crie um aplicativo de calculadora IMC que leia o peso do usuário 
em kg e altura em metros e calcule e exiba o índice de massa 
corporal dele. Além disso, exiba as informações sobre IMC:

IMC = peso / (altura * altura)

Valores de IMC:
Abaixo do peso: menor que 18.5
Normal: entre 18.5 e 24.9
Sobrepeso: entre 25 e 29.9
Obeso: 30 ou maior
*/
import java.util.Scanner;

public class Imc {
	public static void main(String[] main) {
		double peso;
		double altura;
		double imc;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre seu peso (kg): ");
		peso = entrada.nextDouble();
		System.out.print("Entre sua altura (m): ");
		altura = entrada.nextDouble();
		
		entrada.close();
		
		imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC é: %.2f\n", imc);
		System.out.print("Você se encontra: ");
		if (imc < 18.5) {
			System.out.println("Abaixo do peso.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Com peso normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Com sobrepeso.");
		} else {
			System.out.println("Obeso(a).");
		}
	}
}