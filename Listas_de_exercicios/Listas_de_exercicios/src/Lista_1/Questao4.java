package Lista_1;

import java.util.Scanner;


public class Questao4 
{

	public static void main(String[] args)
	{
		double a,b,c,d,r,s;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Atribua um valor a vari�vel A: ");
		a = teclado.nextDouble();
		System.out.print("Atribua um valor a vari�vel B: ");
		b = teclado.nextDouble();
		System.out.print("Atribua um valor a vari�vel C: ");
		c = teclado.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.printf("R=(A+B)^2, ent�o R = %.2f", r);
		System.out.printf("\nS=(B+C)^2, ent�o S = %.2f", s);
		System.out.printf("\nD=(R+S)/2, ent�o D = %.2f", d);
		
		teclado.close();
	}

}