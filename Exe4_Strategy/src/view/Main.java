package view;

import java.util.Scanner;

import models.CalcularImpostos;
import models.ICMS;
import models.IPTU;
import models.IPVA;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalcularImpostos calc = new CalcularImpostos();
		
		System.out.println("---Calculando os impostos---");
		
		System.out.println("Informer o valor à calcular o ICMS: ");
		double icms = sc.nextDouble();
		
		System.out.println("Valor do carro: ");
		double carro = sc.nextDouble();
		
		System.out.println("Valor do imóvel: ");
		double imv = sc.nextDouble();
		
		System.out.println( "Valor calculado icms: " + calc.calcular(new ICMS(), icms) );
		System.out.println( "Valor do carro: " + carro + " IPVA: " + calc.calcular(new IPVA(), carro));
		System.out.println( "Valor do imóvel: " + imv + " IPTU: " + calc.calcular(new IPTU(), imv));
				
	}
}
