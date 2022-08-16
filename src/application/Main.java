package application;

import java.util.Scanner;

import entidades.Retangulo;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Digite a largura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Os dados do retangulo sao: ");
		System.out.println("Altura = " + retangulo.altura + ", Largura = " + retangulo.largura);
		System.out.println("Area = " + retangulo.Area(retangulo.altura, retangulo.largura));
		System.out.println("Perimetro = " + retangulo.Perimetro(retangulo.altura, retangulo.largura));
		System.out.println("Diagonal = " + retangulo.Diagonal(retangulo.altura, retangulo.largura));
		
		
		
		
		sc.close();
	}

}
