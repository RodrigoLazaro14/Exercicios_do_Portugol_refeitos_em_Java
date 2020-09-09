package Lista_1;

import java.util.Scanner;

public class Questao3 
{

	public static void main(String[] args) 
	{
		int resto, horas, minutos, segundos;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a duração do evento em segundos: ");
		segundos = teclado.nextInt();
		horas = segundos/3600;
		resto = segundos%3600;
		minutos = resto/60;
		segundos = resto%60;
		System.out.printf("O evento tem %d horas, %d minutos e %d segundos de duração.", horas, minutos, segundos);
		
		teclado.close();	

	}

}
