package models;

import Interface.Imposto;

public class IPTU implements Imposto{

	@Override
	public double calcular(double valor) {
		return valor * 0.01;
	}

}