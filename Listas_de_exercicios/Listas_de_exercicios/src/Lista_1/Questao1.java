package Lista_1;

import java.util.Scanner;

public class Questao1 
{

	public static void main(String[] args) 
	{
		int anos, meses, dias, totalDias;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite os anos: ");
		anos = teclado.nextInt();
		System.out.print("Digite os meses: ");
		meses = teclado.nextInt();
		System.out.print("Digite os dias: ");
		dias = teclado.nextInt();
		totalDias = ((anos*365)+(meses*30)+dias);
		System.out.printf("Sua idade em dias é de %d dias.", totalDias);
		
		teclado.close();

	}

}