package Lista_1;

import java.util.Scanner;

public class Questao2 
{

	public static void main(String[] args) 
	{
		int resto, anos, meses, dias;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		dias = teclado.nextInt();
		anos = dias/365;
		resto = dias%365;
		meses = resto/30;
		dias = resto%30;
		System.out.printf("Você tem %d anos, %d meses e %d dias.", anos, meses, dias);
		
		teclado.close();		
	}

}