package Lista_1;

import java.util.Locale;
import java.util.Scanner;

public class Questao7 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); /*serve para usar o ponto como v�rgula no console,
		 para quando digitar n�meros reais. Sempre colocar primeiro, antes de qualquer coisa.*/
		
		double a,b,c,d,e,f,x,y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = teclado.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = teclado.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = teclado.nextDouble();
		System.out.print("Digite o valor de D: ");
		d = teclado.nextDouble();
		System.out.print("Digite o valor de E: ");
		e = teclado.nextDouble();
		System.out.print("Digite o valor de F: ");
		f = teclado.nextDouble();
		
		x = ((c*e-b*f)/(a*e-b*d));
		y = ((a*f-c*d)/(a*e-b*d));
		System.out.printf("Se x=((c*e-b*f)/(a*e-b*d)), ent�o x = %.2f", x);
		System.out.printf("\nSe y=((a*f-c*d)/(a*e-b*d)), ent�o y = %.2f ", y);
		
		teclado.close();
	}

}