package models;

import Interface.Imposto;

public class IPVA implements Imposto{

	@Override
	public double calcular(double valor) {
		return valor * 0.015;
	}

}