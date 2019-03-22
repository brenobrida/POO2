package Aula_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2;
		double res;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro número inteiro");
		n1 = input.nextInt();
		System.out.println("Insira o segundo número inteiro");
		n2 = input.nextInt();
		
		Operacao operacao = new Operacao(n1, n2);

		operacao.soma();
		System.out.println("O resultado da soma é: "+ operacao.getResultado());
		
		operacao.sub();
		System.out.println("O resultado da subtração é: " + operacao.getResultado());
		
		operacao.med(n1, n2);
		System.out.println("A média dos números é: "+ operacao.getResultado());
		
		res = operacao.pot();
		System.out.println("O resultado da potência é: " + res);
		
    		res = operacao.mult();
		System.out.println("O resultado da multiplicação dos números é: "+ res);

		res = operacao.div(n1, n2);
		System.out.println("O resultado da divisão dos números é: "+ res);	
    
		res = operacao.medp(1, 2);
		System.out.println("O resultado da média ponderada dos números é: "+ res+"\n");
		
	}
}