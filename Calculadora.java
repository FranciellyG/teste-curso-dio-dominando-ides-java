package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b, c;

		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		c = scan.nextDouble();
		
		double soma = soma (a,b,c);
		double subtracao = subtracao(a,b,c);
		double multiplicacao = multiplicacao(a,b,c);
		double divisao = divisao(a,b,c);
	
		
		System.out.println("soma: " + soma);
		System.out.println("sub " + subtracao);
		System.out.println("mult " + multiplicacao);
		System.out.println("div " + divisao);
	}

	public static double soma (double a, double b) {
		return a + b;
	}
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}	
}


