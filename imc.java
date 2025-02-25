package projeto01;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o seu peso por favor: ");
		double imc = sc.nextDouble();

		if (imc > 18.5 ) {
			System.out.println("Você está saudavel.");
		} else if (imc < 25) {
			System.out.println("Você está Sobrepeso");
		} else if (imc < 30) {
			System.out.println("Você está com Obesidade grau 1");
		} else if (imc < 35) {
			System.out.println("Você está com Obesidade grau 2");
		} else {
			System.out.println("Você está com Obesidade.");
		}
		
		

	
		sc.close();

	}

}
