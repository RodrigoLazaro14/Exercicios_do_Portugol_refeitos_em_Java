package Lista_1;

import java.util.Scanner;

public class Questao8 
{

	public static void main(String[] args) 
	{
		
		double custoConsumidor, custoFabrica, distribuidor, impostos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual o custo de F�brica?\nR$ ");
		custoFabrica = teclado.nextDouble();
		distribuidor = (custoFabrica*0.28);
		impostos = (custoFabrica*0.45);
		custoConsumidor = (custoFabrica+distribuidor+impostos);
		System.out.printf("Percentagem do distribuidor: R$ %.2f", distribuidor);
		System.out.printf("\nImpostos: R$ %.2f", impostos);
		System.out.printf("\nO custo para o consumidor � de R$ %.2f", custoConsumidor);
		teclado.close();
	}

}
