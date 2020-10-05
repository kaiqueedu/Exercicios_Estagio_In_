package models;

import Interface.Imposto;

public class CalcularImpostos {

	public double calcular(Imposto imposto, double valor) {
		return imposto.calcular(valor);
	}
	
}
