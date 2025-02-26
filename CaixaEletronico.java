package projeto01;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        double saldo = 0.0;
	        
	        System.out.println("Bem vindo ao Banco Central");
	        
	        while (true) {
	            System.out.println("\n1 - Depósito ");
	            System.out.println("2 - Saque ");
	            System.out.println("3 - Consulta de Saldo ");
	            System.out.println("4 - Sair");
	            System.out.print("Escolha uma opção: ");
	            
	            int opcao = sc.nextInt();
	            
	            if (opcao == 1) {
	                System.out.print("Digite o valor para depósito: ");
	                saldo += sc.nextDouble();
	                System.out.println("Depósito realizado com sucesso.");
	            } else if (opcao == 2) {
	                System.out.print("Digite o valor para saque: ");
	                double saque = sc.nextDouble();
	                if (saque <= saldo) {
	                    saldo -= saque;
	                    System.out.println("Saque realizado com sucesso.");
	                } else {
	                    System.out.println("Saldo insuficiente.");
	                }
	            } else if (opcao == 3) {
	                System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
	            } else if (opcao == 4) {
	                System.out.println("Saindo do Caixa Eletrônico.");
	                break;
	            } else {
	                System.out.println("Opção inválida! Tente novamente.");
	            }
	        }
	        
	        sc.close();
	    }
	

}


